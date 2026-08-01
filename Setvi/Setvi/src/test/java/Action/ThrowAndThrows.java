package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;

public class ThrowAndThrows {

    public static void testThrows() throws InterruptedException, NoSuchElementException, ArithmeticException {
        Thread.sleep(5000);
    }

    // We can throw multiple exception in the method signature

    public static void main(String[] args) throws InterruptedException {
        //ThrowAndThrows.testThrows(); // We called it, now it thorws error since we didn't expilict exception in the method
        ThrowAndThrows.testThrow();
    }

    public static void testThrow(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://theeminence.org:2096/");
        try{
            driver.findElement(By.xpath("//input[@id='user13']")).sendKeys("emailAddress");
        } catch (Exception e) {
            System.out.println("Element not found");
            throw new RuntimeException(e);
        } // now code run will stop here if the element not found
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password");
        driver.findElement(By.xpath("//button[@id='login_submit']")).click();

    }
}
