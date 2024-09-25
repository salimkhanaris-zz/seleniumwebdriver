package day27;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver();

        //Fluent Wait Declaration
        Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoSuchElementException.class);


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement link = mywait.until(new Function<WebDriver, WebElement>() {
                                           public WebElement apply(WebDriver driver) {
                                               return driver.findElement(By.linkText("OrangeHRM, Inc"));
                                           }
                                       });
        link.click();

        //driver.findElement(By.linkText("OrangeHRM, Inc")).click();--- This isnt required in case of explicit wait as its already taken care of in until

        driver.quit();
    }
}
