package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_onclick3");
        driver.manage().window().maximize();
        WebElement frame= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));;
        driver.switchTo().frame(frame);
        WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();
        f1.sendKeys("Salim");
        WebElement copybutton= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        WebElement f2= driver.findElement(By.xpath("//input[@id='field2']"));
        Actions act=new Actions(driver);
        act.doubleClick(copybutton).perform();

        System.out.println("Captured value is "+f2.getAttribute("value"));
        if (f2.getAttribute("value").equals("Salim"))
        {
            System.out.println("The text matches");
        }
        else
            System.out.println("Text does not match");
        driver.quit();
    }
}
