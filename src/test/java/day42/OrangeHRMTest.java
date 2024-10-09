package day42;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest
{

    WebDriver driver;

    @Test(priority = 1)
    void openapp()
    {
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Website Opened");
    }

    @Test(priority = 2)
    void testlogo() throws InterruptedException {

        Thread.sleep(3000);
        WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        if (logo.isDisplayed())
        {
            System.out.println("Logo is present");
        }
    }

    @Test(priority = 3)
    void login()

    {

        driver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']"))
                        .click();
        System.out.println("Login Successful");

    }

    @Test(priority = 4)
    void logout() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"))
                .click();
        driver.findElement(By.xpath("//a[normalize-space()='Logout']"))
                .click();
        System.out.println("Logout Successful");
    }
}
