package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args) throws InterruptedException {
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--force-device-scale-factor=0.5");*/
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //Passed frame as a Webelement
        driver.findElement(By.xpath("//input[@name='mytext1']"))
                .sendKeys("Testing");

        //Switch back to page before seitching to another frame

        driver.switchTo().defaultContent();

         //Frame 2
        WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']"))
                .sendKeys("Testing2");
        driver.switchTo().defaultContent();

        //Frame 3 (It contains an iFrame withing the frame)
        WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']"))
                .sendKeys("Testing3");

        //inner iframe- part of frame 3
        driver.switchTo().frame(0); //Switching to iFrame using index
        System.out.println("iFrame selected");
        driver.findElement(By.xpath("//*[starts-with(text(),'Web')]"))
                .click();
        System.out.println("Clicked");
        driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']"))
                .click();
        System.out.println("Clicked");
        driver.switchTo().defaultContent();

        //Switching to Frame 5
        WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name='mytext5']"))
                .sendKeys("Testing5");
        WebElement link= mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("https://a9t9.com")));
        link.click();
        WebElement logo=driver.findElement(By.xpath("//a[@id='logo']"));
        if (logo.isDisplayed()){
            System.out.println("Logo is present");
        }





    }
}
