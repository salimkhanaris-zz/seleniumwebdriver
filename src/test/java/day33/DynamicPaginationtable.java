package day33;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DynamicPaginationtable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");

        //Login
        driver.findElement(By.xpath("//input[@id='input-username']"))
                .sendKeys("demoadmin");
        driver.findElement(By.xpath("//input[@id='input-password']"))
                .sendKeys("demopass");
        driver.findElement(By.xpath("//button[normalize-space()='Login']"))
                .click();

        //Click on Customers
        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']"))
                .click();

        //Click on Child customers
        driver.findElement(By.xpath("//ul[@id='collapse9']//a[contains(text(),'Customers')]"))
                .click();

        //Find total number of pages

        String pagenumber=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        int totalpages= Integer.parseInt(pagenumber.substring(pagenumber.indexOf("(")+1,pagenumber.indexOf("Pages")-1));
        System.out.println(totalpages);

        for (int p=1; p<totalpages;p++)
        {

        }



        Thread.sleep(2000);





        driver.quit();


    }
}
