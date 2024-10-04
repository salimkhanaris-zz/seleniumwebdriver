package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DiableAutomatedMessage {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://practice.automationtesting.in/product/thinking-in-html/");
        driver.manage().window().maximize();
    }
}
