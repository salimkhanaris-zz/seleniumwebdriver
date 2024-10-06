package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSVGElements {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");//Setting for Headless Test
        WebDriver driver=new ChromeDriver(options);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='username']"))
                .sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='password']"))
                .sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']"))
                .click();
        //You can use rel xpath for svg but not absolute

        driver.findElement(By.xpath("//a[normalize-space()='Time']//*[name()='svg']"))
                .click();

        //identify svg element
        driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();
    }
}
