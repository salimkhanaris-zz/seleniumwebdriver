package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://testautomationpractice.blogspot.com/");//--- Accepts URL only in String format
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.navigate().back();
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.navigate().forward();
        url= driver.getCurrentUrl();
        System.out.println(url);
        //driver.navigate().to can also accept url in URL object format.

        /* We usually dont do this, just use the URL in String format.
        URL myurl= new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to(myurl);*/



    }

}
