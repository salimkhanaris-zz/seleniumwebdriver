package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Google_AutpDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']"))
                .sendKeys("Selenium"); //This is the search area
        Thread.sleep(4000);
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox' and @class='G43f7e']//li//div[@role='option']"));
        System.out.println("The total number of suggestions are "+list.size());
        for (WebElement x:list){
            System.out.println(x.getText());
            if (x.getText().equals("selenium rich foods")){
                x.click();
                break;
            }
        }

        driver.quit();

    }
}
