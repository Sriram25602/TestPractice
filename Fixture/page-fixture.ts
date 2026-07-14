import {test as baseTest, expect as baseExpect} from '@playwright/test';
import {InputPage} from '../Page/InputPage';

type MyFixtures = {
    inputPage: InputPage;
}

export const test = baseTest.extend<MyFixtures>({

    inputPage: async({page}, use) => {
        const input = new InputPage(page, test);
        await use(input);
    }

});

export const expect = baseExpect;
