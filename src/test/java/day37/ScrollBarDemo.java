package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        //1. Scroll down the page by pixel number

        //js.executeScript("window.scrollBy(0,1500)","");

        //Print Window Location

        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //2. Scroll the page till element is displayed

        /*WebElement title= driver.findElement(By.xpath("//h2[normalize-space()='XPath Axes']"));
        js.executeScript("arguments[0].scrollIntoView();",title);
        System.out.println(js.executeScript("return window.pageYOffset;"));*/

        //3. Navigate to the bottom of the page

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        System.out.println(js.executeScript("return window.pageYOffset;"));

        //Scrolling upto inital position

        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        System.out.println(js.executeScript("return window.pageYOffset;"));




    }
}
