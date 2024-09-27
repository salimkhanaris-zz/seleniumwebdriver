package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement color= driver.findElement(By.xpath("//select[@id='colors']"));
        Select clr= new Select(color);
        clr.selectByIndex(1);
        WebElement y= clr.getFirstSelectedOption();
        //Print the selected option
        System.out.println("The selected country is "+y.getText());
        //Print all options
        List<WebElement>options= clr.getOptions();
        for (WebElement x: options)
        {
            System.out.println(x.getText());
        }
        driver.quit();

    }
}
