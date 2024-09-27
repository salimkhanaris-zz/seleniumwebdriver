package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //WebDriverWait newwait= new WebDriverWait(driver, Duration.ofSeconds(5));
        WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://jquery-az.com/boots//demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //Select single options
        driver.findElement(By.xpath("//button[@type='button']"))
                .click(); //opens dropdown options
        driver.findElement(By.xpath("//input[@value='Java']"))
                .click();
        //Capture all options and find size
        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]//label"));
        System.out.println("Number of options are "+options.size());

        //Print all options
        for (WebElement x:options){
            System.out.println(x.getText());
        }

        //Select Multiple options
        for (WebElement x:options){
            if (x.getText().equals("Java")||x.getText().equals("Python")|| x.getText().equals("MySQL"))
            {
                x.click();
            }
        }
    }
}
