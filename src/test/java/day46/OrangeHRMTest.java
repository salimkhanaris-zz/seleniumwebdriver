package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(day46.MyListener.class)  //to use Listener class without the use of XML

public class OrangeHRMTest {
    WebDriver driver;

    @BeforeClass

    void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void testLogo() throws InterruptedException {

        Thread.sleep(2000);
        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);
    }

    @Test(priority = 3,dependsOnMethods = {"testURL"})
    void testTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test(priority = 2)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opnsource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
