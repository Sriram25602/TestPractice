import{Page, Locator} from '@playwright/test';
import { expect } from '@playwright/test';
import { waitForDebugger } from 'node:inspector';


export class InputPage{

    page: Page;

    constructor(page: Page, test: any){
        this.page = page;
    }

    async GoToSite(){
        await this.page.goto("https://www.qafeast.com/demo");
    }
    async editableBoxCheck(){
        const editableBox = this.page.locator('input[id="editabletext"]').first(); 
        await editableBox.fill("Automation Testing"); 

        await editableBox.clear(); 
        await editableBox.pressSequentially("Test", {delay: 50});
        await expect(editableBox).toHaveValue("Test", {timeout: 6000});
    }


}
