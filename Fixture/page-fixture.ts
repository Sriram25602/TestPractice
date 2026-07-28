import {test as baseTest, expect as baseExpect} from '@playwright/test';
import {InputPage} from '../Page/InputPage';
import inputFieldData from '../Fixture/InputFieldData/InputField-data.json';

type MyFixtures = {
    inputPage: InputPage;
}

export const test = baseTest.extend<MyFixtures>({

    inputPage: async({page}, use) => {
        const input = new InputPage(page, inputFieldData);
        await use(input);
    }



});

export const expect = baseExpect;
