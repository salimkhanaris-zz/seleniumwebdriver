package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class DatePickerDemo3 {
    static void selectFutureDate(WebDriver driver, String month, String year, String day)
    {
        //Select Month and Year

        while(true){

            WebElement mt = driver.findElement(By.xpath("//select[@title='Change the month']"));
            Select mont= new Select(mt);
            mont.selectByVisibleText(month);
            WebElement yr= driver.findElement(By.xpath("//select[@title='Change the year']"));
            Select yea= new Select(yr);
            yea.selectByVisibleText(year);
            if (mt.equals(month)&& yr.equals(year))
            {
                break;
            }
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

        }
        //Select the date
        //Method 1
        WebDriverWait ww=new WebDriverWait(driver,Duration.ofSeconds(10));
        //List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='datepick-popup']//div[@class='datepick-month']//table//tr//td//a[@href='javascript:void(0)']"));
/*        for (WebElement x: alldates)
        {
            System.out.println(x.getText());
            if (x.getText().equals(day)){
                x.click();
                break;
            }

        }*/
        //Method 2
       for (int i=1;i<=Integer.parseInt(day);i++)
        {
            WebElement date= driver.findElement(By.xpath("//div[@class='datepick-popup']//div[@class='datepick-month']//table//tr//td//a[@href='javascript:void(0)']"));
            ww.until(ExpectedConditions.visibilityOfAllElements(date));
            if (date.getText().equals(day))
            {
                date.click();
                break;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();

        //Method 1-- using send keys method
        /*driver.findElement(By.xpath("//input[@id='datepicker']"))
                .sendKeys("09/01/2024");*/

        //Expected Data
        // Step 1: Declare string variables for year,month and day
/*        String year= "2027";
        String month= "January";
        String day="31";*/
        driver.findElement(By.xpath("//input[@id='datepicker2']"))
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
