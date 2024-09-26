package day29;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //Implicit Wait
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Normal Alert with OK Button
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"))
                .click();
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();
        driver.quit();*/

        //Confirmation alert by clicking OK

 /*       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"))
                .click();
        Alert myalert=driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept(); //use dismiss method for cancelling the alert
        driver.quit();*/

        //Enter Text in Alert and Hit OK

        driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Prompt'])[1]"))
                .click();
        Alert myalert=driver.switchTo().alert();
        System.out.println( myalert.getText());
        myalert.sendKeys("Salim");
        //myalert.accept();
        myalert.dismiss();
        //driver.quit();
    }
}
