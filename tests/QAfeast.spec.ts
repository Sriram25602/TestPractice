import { test, expect } from '../Fixture/page-fixture';
import { InputPage } from '../Page/InputPage';

test.describe.configure({
mode: 'parallel',
}); 
test.describe("Qa feast test", async() => {

  test.beforeEach('Go to site', async({inputPage}) => {
  await inputPage.GoToSite();
});

test('Go to the QAfeast site and execute all functionalities', async({inputPage})=>{
  await inputPage.editableBoxCheck();

});

test('Verify test 2', async ({inputPage})=> {
  await inputPage.buttonCheck();
  await inputPage.hyperLink();
});

test('Verify dropdown functionality', async({inputPage}) => {
  await inputPage.dropDownCheck(); 

})

test('Check drag and drop functionaity', async({inputPage}) => {
  await inputPage.dragAndDrop();
});

test('Check right click functionality', async ({inputPage}, testInfo) => {
  await inputPage.rightClickCheck();
})

test('Check double click functionality', async ({inputPage}) => {

  await inputPage.doubleClick();
});

});
