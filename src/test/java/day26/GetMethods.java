package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void  main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> wid = driver.getWindowHandles();
        System.out.println(wid);

        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        //System.out.println("The ID of the window handle is: "+driver.getWindowHandle());

        driver.quit();


    }
}
