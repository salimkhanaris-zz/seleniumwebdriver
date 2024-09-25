package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(5000);
        driver.close(); //Closes the first tab which is the 1st tab by default
        driver.quit();//CLoses all windows


    }
}
