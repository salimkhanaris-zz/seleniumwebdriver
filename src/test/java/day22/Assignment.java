package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        List<WebElement> links= driver.findElements(By.className("nav-link"));
        System.out.println("Total number of links are: "+links.size());

        List<WebElement> images= driver.findElements(By.tagName("img"));
        System.out.println("Total number of images are: "+images.size());
        driver.quit();
    }
}
