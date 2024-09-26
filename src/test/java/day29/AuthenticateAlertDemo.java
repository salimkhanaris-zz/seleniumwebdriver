package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticateAlertDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //Syntax is https://username:password@siteurl
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
