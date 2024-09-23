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
        //driver.findElement(By.cssSelector("input#searchBar")).sendKeys("World");

        //Tag and class- tag.class

        //driver.findElement(By.cssSelector("input.ui-focus")).sendKeys("World");

        //tag and attribute
        //driver.findElement(By.cssSelector("input[data-type=search]")).sendKeys("World");

        //tag and class and attribute
        driver.findElement(By.cssSelector("input.ui-focus[data-type=search]")).sendKeys("World");


    }
}
