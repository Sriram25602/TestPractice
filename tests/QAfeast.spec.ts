import { test, expect } from '../Fixture/page-fixture';


test('Go to the QAfeast site and execute all functionalities', async({inputPage})=>{

  await inputPage.GoToSite();
  await inputPage.editableBoxCheck();

});
