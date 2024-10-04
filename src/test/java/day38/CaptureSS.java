package day38;

import dev.failsafe.function.CheckedRunnable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class CaptureSS {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://practice.automationtesting.in/product/thinking-in-html/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Fullpage SS
        TakesScreenshot ts=(TakesScreenshot) driver;
/*        File sourceFile= ts.getScreenshotAs(OutputType.FILE);
        //System.getProperty("user.dir")== C:\\Learning\\LearningSelenium
        File targetFile= new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
        sourceFile.renameTo(targetFile);*/

        //Specific Section SS
        WebElement books=driver.findElement(By.xpath("//ul[@class='products']"));
        books.getScreenshotAs(OutputType.FILE);
        File sourceFile= ts.getScreenshotAs(OutputType.FILE);
        //System.getProperty("user.dir")== C:\\Learning\\LearningSelenium
        File targetFile= new File(System.getProperty("user.dir")+"\\Screenshots\\portion1.png");
        sourceFile.renameTo(targetFile);

        driver.quit();






    }
}
