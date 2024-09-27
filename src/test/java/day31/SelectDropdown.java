package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement country= driver.findElement(By.xpath("//select[@id='country']"));
        Select coption= new Select(country);
        //Select option from the dropdown
        //coption.selectByIndex(1);
        //coption.selectByValue("france");
        coption.selectByVisibleText("Japan");

        //captuer the options from the dropdown
        List<WebElement> options=coption.getOptions();
        System.out.println(options);




    }
}
