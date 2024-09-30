package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class DatePickerDemo {
    static void selectFutureDate(WebDriver driver, String month, String year, String day)
    {
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
        //Select the date
        //Method 1
        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement x: alldates)
        {
            if (x.getText().equals(day)){
                x.click();
                break;
            }

        }
        //Method 2
       /* for (int i=1;i<=Integer.parseInt(day);i++)
        {
            WebElement date= driver.findElement(By.xpath("//a[normalize-space()='"+i+"']"));
            if (date.getText().equals(day))
            {
                date.click();
                break;
            }
        }*/
    }
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
       /* String year= "2027";
        String month= "January";
        String day="31";*/
        driver.findElement(By.xpath("//input[@id='datepicker']"))
                .click();
        //User input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year: ");
        String year= sc.next();
        System.out.println("Enter Month (Keep the first word in caps): ");
        String month = sc.next();
        System.out.println("Enter date: ");
        String day = sc.next();
        selectFutureDate(driver,month, year,day);
        Thread.sleep(3000);
        driver.quit();

    }
}
