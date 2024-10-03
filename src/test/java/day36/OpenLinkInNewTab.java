package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpenLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        Actions act= new Actions(driver);
        WebElement skip=driver.findElement(By.xpath("//button[@id='btn2']"));
        //WebElement reglink= driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        act.keyDown(Keys.CONTROL).click(skip).perform();
        //Switch to a the new tab
        List<String> wid= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(wid.get(1));
        //driver.quit();
    }
}
