package day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FDCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {
        //ChromeOptions options= new ChromeOptions();
        //options.addArguments("--headless=yes");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        Thread.sleep(5000);
        //windows Path
        //String filepath= System.getProperty("user.dir")+"\\Excel\\caldata.xlsx";

        //Mac Path
        String filepath= System.getProperty("user.dir")+"/Excel/caldata.xlsx";
        int rows=ExcelUtils.getRowCount(filepath,"Sheet1");
        for (int r=1;r<=rows;r++)
        {
            //Read Data from excel

            String principal= ExcelUtils.getCellData(filepath,"Sheet1",r,0);
            String rate= ExcelUtils.getCellData(filepath,"Sheet1",r,1);
            String time1= ExcelUtils.getCellData(filepath,"Sheet1",r,2);
            String time2= ExcelUtils.getCellData(filepath,"Sheet1",r,3);
            String frequency= ExcelUtils.getCellData(filepath,"Sheet1",r,4);
            String mat= ExcelUtils.getCellData(filepath,"Sheet1",r,5);

            //Pass above data into application
            driver.findElement(By.xpath("//input[@id='principal']"))
                    .sendKeys(principal);
            driver.findElement(By.xpath("//input[@id='interest']"))
                    .sendKeys(rate);
            driver.findElement(By.xpath("//input[@id='tenure']"))
                    .sendKeys(time1);
            WebElement pd= driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
            Select pd1= new Select(pd);
            pd1.selectByVisibleText(time2);

            WebElement freq= driver.findElement(By.xpath("//select[@id='frequency']"));
            Select f= new Select(freq);
            f.selectByVisibleText(frequency);

            //Click on Calculate

            driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"))
                    .click();

            //Validation
            String mat_val= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
            if (Double.parseDouble(mat_val)==Double.parseDouble(mat))
            {
                System.out.println("Test Passed");
                ExcelUtils.setCellData(filepath,"Sheet1",r,7,"Passed");
                ExcelUtils.fillGreenColor(filepath,"Sheet1",r,7);
            }
            else
            {
                System.out.println("Test Failed");
                ExcelUtils.setCellData(filepath,"Sheet1",r,7,"Failed");
                ExcelUtils.fillRedColor(filepath,"Sheet1",r,7);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click(); //Clear button

        } //for loop ends here
        driver.quit();

    }
}
