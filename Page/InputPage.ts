import{Page, expect, Locator} from '@playwright/test';
import { waitForDebugger } from 'node:inspector';


export class InputPage{

    page: Page;
    editableTextBox: Locator;
    inputFieldData: any;

    constructor(page: Page, inputFieldData: any){
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


}
