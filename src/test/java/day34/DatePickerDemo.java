package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //switch to iframe
        driver.switchTo().frame(0);

        //Method 1-- using send keys method
        /*driver.findElement(By.xpath("//input[@id='datepicker']"))
                .sendKeys("09/01/2024");*/

        //Method 2-- Using date picker
        //Expected Data
        // Step 1: Declare string variables for year,month and day
        String year= "2026";
        String month= "January";
        String day="20";
        driver.findElement(By.xpath("//input[@id='datepicker']"))
                .click();

        //Select Month and Year

        while(true){

            String mt = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yr= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (mt.equals(month)&& yr.equals(year))
            {
               break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

        }


        Thread.sleep(3000);

        driver.quit();

    }
}
