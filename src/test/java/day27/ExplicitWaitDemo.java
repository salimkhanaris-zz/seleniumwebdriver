package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));  //Declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        WebElement link= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OrangeHRM, Inc")));

        //driver.findElement(By.linkText("OrangeHRM, Inc")).click();--- This isnt required in case of explicit wait as its already taken care of in until
        link.click();
        driver.quit();
    }
}
