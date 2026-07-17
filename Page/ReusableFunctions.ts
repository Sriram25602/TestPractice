import {test, expect, Page} from '@playwright/test'; 
import { Locator } from '@playwright/test';


export class ReusableFunctions{

    page: Page;

    constructor(page: Page){
        this.page = page;         
    }

    async customExpect(locator: Locator, message: string, softAssert: boolean = false){
      return softAssert ? expect(locator): expect.soft(locator); 
    }

}