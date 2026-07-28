import{Page, expect, Locator} from '@playwright/test';
import { waitForDebugger } from 'node:inspector'; 
import { ReusableFunctions } from './ReusableFunctions';
import path from 'path';


export class InputPage extends ReusableFunctions{

    page: Page;
    editableTextBox: Locator;
    inputFieldData: any;

    constructor(page: Page, inputFieldData: any){
        super(page);
        this.page = page;
        this.editableTextBox = page.locator('input[id="editabletext"]').first(); 
        this.inputFieldData = inputFieldData;
    }

    async GoToSite(){
        await this.page.goto("https://www.qafeast.com/demo");
    }
    async editableBoxCheck(){
        await this.editableTextBox.fill(this.inputFieldData.SampleText); 
        await this.editableTextBox.clear(); 
        await this.editableTextBox.pressSequentially("Test", {delay: 50});
        await expect(this.editableTextBox).toHaveValue("Test", {timeout: 6000});
    }

    async buttonCheck(){
        await this.navigateToTab('Button');
        await this.page.locator('button[id="button-1"]').filter({hasText: 'Submit'}).click(); 
        const textMessage = this.page.locator('p:text-is("Submit button is clicked")'); 
        await expect(textMessage).toBeVisible(); 
        //await this.customExpect(textMessage, 'Verify that the text message is visible after clicked Submit button').toBeVisible(); 
    }

    async hyperLink(){
        await this.navigateToTab('Hyperlink');

        const [newpage] = await Promise.all([
            this.page.waitForEvent('popup'),
            this.page.getByText('Web browser automation').click()
        ]);        
        
        
        await newpage.waitForLoadState(); 
         console.log(await newpage.title()); 
         await expect(newpage).toHaveURL('https://www.selenium.dev/');
         const searchBoxInNewPage = newpage.locator('button[aria-label="Search"]')
         await expect(searchBoxInNewPage).toBeVisible(); 

         await newpage.close(); 
    }

    async dropDownCheck(){
        await this.navigateToTab('Dropdown');

        const countryDD = this.page.locator('[name="countryname"]');

        //Select by text directly
        await countryDD.selectOption('INDIA');

        //Select by Index number
        await countryDD.selectOption({index: 15}); 

        //Select by value
        await countryDD.selectOption('251'); 

        //Select by text using label keyword
        await countryDD.selectOption({label: 'ANTARCTICA '}); 

        //Print the selected option in the dropdown
       const selectedValue = await countryDD.locator(' option:checked').textContent(); 
        console.log(selectedValue);

        //print check if the option is available in the dropdown 
        expect(countryDD).toContainText('AUSTRALIA');
    }

    async dragAndDrop(){
        await this.navigateToTab('Drag & Drop');

        const source = this.page.locator('p:text-is("Java")'); 
        const target = this.page.locator('p:text-is("javac")'); 

        await source.dragTo(target);
        await expect(target.locator('..')).toHaveAttribute('class', /ui-state-highlight/);
    }

    async rightClickCheck(){
        await this.navigateToTab('Context Menu');

        // const [dialog] = await Promise.all([
        //     this.page.waitForEvent('dialog'), 
        //     this.page.locator('#hot-spot').click({button: 'right'})
        // ])
        
        // expect(dialog.message()).toBe('You selected a context menu');
        // await dialog.accept(); 

        this.page.on('dialog', async dialog => {
            expect(dialog.message()).toBe('You selected a context menu');
            await dialog.accept();
        });
        
        await this.page.locator('#hot-spot').click({button: 'right'});
    }

    async doubleClick(){

        await this.page.locator('li label:text-is("Double Click")').click(); 

            const tab = this.page.locator('h2:text-is("Double click")');
            expect(tab).toBeVisible();


        await this.page.locator('p:text-is("Double-click this paragraph to trigger a function.")').click({clickCount: 2}); 

        const expectedText = this.page.locator('div:text-is("Hello World")'); 
        expect(expectedText).toBeVisible(); 
    }

    async fileUpload(){

        await this.page.locator('li label:text-is("File Upload & Download event")').click(); 

        const filePath = "Fixture/Resources/tv-blue-quotes-glasses-breaking-bad-badass-walter-white-final-1920x1080-abstract-breaking-bad-hd-art-wallpaper-thumb.jpg";

            const tab = this.page.locator('h2:text-is("File Uploader")');
            expect(tab).toBeVisible();

            await this.page.locator('[id="file-upload"]').setInputFiles(path.join(process.cwd(), filePath)); 
    }

    async fileDownload(){
        await this.page.locator('li label:text-is("File Upload & Download event")').click(); 
        const tab = this.page.locator('h2:text-is("File Uploader")');
        expect(tab).toBeVisible();

        const filePath = "Fixture/Resources/tv-blue-quotes-glasses-breaking-bad-badass-walter-white-final-1920x1080-abstract-breaking-bad-hd-art-wallpaper-thumb.jpg";


        const link1 = this.page.locator('a:text-is("Regression.csv")'); 
        const link2 = this.page.locator('a:text-is("Lorem Ipsum.pdf")'); 

        const downloadPromise = this.page.waitForEvent('download')
        await link1.click(); 
        const download = await downloadPromise; 

        await download.saveAs(filePath + download.suggestedFilename());
    }
}
