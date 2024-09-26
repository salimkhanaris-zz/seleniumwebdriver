package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Select one checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //Select Multiple Checkboxes
        List <WebElement> cb=driver.findElements(By.xpath("//input[(@class='form-check-input' and @type='checkbox')]"));
        for (WebElement cbo:cb){
            cbo.click();
        }
    }
}
