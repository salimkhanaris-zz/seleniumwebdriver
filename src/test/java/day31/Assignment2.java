package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        WebElement country= driver.findElement(By.xpath("//select[@id='country-list']"));
        Select cty= new Select(country);
        cty.selectByIndex(1);
        WebElement y= cty.getFirstSelectedOption();
        //Print the selected option
        System.out.println("The selected country is "+y.getText());
        //Print all options
        List<WebElement>options= cty.getOptions();
        for (WebElement x: options)
        {
            System.out.println(x.getText());
        }
        driver.quit();

    }
}
