package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {
    WebDriver driver;
    //ChromeOptions options;

    @BeforeClass
    void setup()
    {

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(dataProvider = "dp")
    void testLogin(String email, String password)
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']"))
                .sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']"))
                .sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        boolean status = driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
        if (status==true)
        {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"))
                    .click();
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
    }

    @AfterClass
    void teardDown()
    {
        driver.quit();
    }

    @DataProvider(name = "dp",indices = {0,3})
    Object[][] loginData()
    {
        Object data [][]= {
                {"abc@gmail.com","test123"},
                {"bcd@gmail.com","test123"},
                {"adddbc@gmail.com","test123"},
                {"salimkhan@yopmail.com","salim1234"},
        };

        return data;
    }
}
