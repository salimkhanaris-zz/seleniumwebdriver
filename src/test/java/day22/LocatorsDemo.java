package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
        //driver.findElement(By.partialLinkText("Tabl")).click();

        //capture multiple webelemts

        //List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
        //System.out.println("Total links: "+headerlinks.size());

        //List<WebElement> links=driver.findElements(By.tagName("a"));
        //System.out.println("Total Links: "+links.size());
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Number of images are: "+images.size() );


        Thread.sleep(6000);
        driver.quit();
    }
}
