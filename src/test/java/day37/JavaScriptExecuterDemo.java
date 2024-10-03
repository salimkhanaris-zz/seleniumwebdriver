package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Salim");
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));

        //Passing text into inoutbox- alternate of Sendkeys method
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','Salim')",inputbox);

        //Click on element using JSExec
        WebElement rb=driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",rb);
        System.out.println("Button CLicked");


    }
}
