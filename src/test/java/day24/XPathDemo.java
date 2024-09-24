package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();

        //XPath with a single attribute
        //driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Tablet");

        //XPath with multiple attributes

        driver.findElement(By.xpath(("//input[@name='search'][@placeholder='Search']"))).sendKeys("Tablet");
    }
}
