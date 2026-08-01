package Test;

import org.testng.annotations.*;

public class LoginTest {


    @Test
    public void TestDefault(){
        System.out.println("My Test");
    }

    @Test
    public void TestDefault1(){
        System.out.println("My Test 2");
    }

    @BeforeMethod
    public void Test1(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void Test2(){
        System.out.println("After method");
    }

    @BeforeClass
    public void Test3(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void Test4(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void Test5(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void Test6(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void Test7(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void Test8(){
        System.out.println("AfterS uite");
    }


}
