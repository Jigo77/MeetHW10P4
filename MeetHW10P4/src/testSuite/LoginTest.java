package testSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {


        WebElement emailfeild = driver.findElement(By.xpath("//div/input[@id='user-name']"));
        emailfeild.sendKeys("standard_user");

        WebElement passwordfeild = driver.findElement(By.xpath("//div/input[@id='password']"));
        passwordfeild.sendKeys("secret_sauce");

        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbutton.click();



    }


    @After
    public void tearDown() {

        //closeBrowser();
    }
}
