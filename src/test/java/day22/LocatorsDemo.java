package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize(); //To maximize window

        //name as a locator
        //driver.findElement(By.name("search")).sendKeys("Mac");

        //id as a locator
        //boolean logodisp=driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logodisp);

        //linktext and partiallinktext
        //driver.findElement(By.linkText("Tablets")).click();
        driver.findElement(By.partialLinkText("Tabl")).click();



        Thread.sleep(6000);
        driver.quit();
    }
}
