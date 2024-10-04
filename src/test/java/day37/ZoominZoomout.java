package day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomout {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        //driver.manage().window().minimize();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Zoom Level
        js.executeScript("document.body.style.zoom='50%'");
        //driver.quit();
    }
}
