package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSSL {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        //options.addArguments("--headless=new");
        options.setAcceptInsecureCerts(true); //Will accept SSL Certificate
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
}
