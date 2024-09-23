package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSLocators {
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();
        //Using tag and ID
        driver.findElement(By.cssSelector("input#searchBar")).sendKeys("World");
    }
}
