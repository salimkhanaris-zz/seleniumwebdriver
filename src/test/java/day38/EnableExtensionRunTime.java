package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class EnableExtensionRunTime {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        File file= new File(System.getProperty("user.dir")+"\\crx\\block.crx");
        options.addExtensions(file);
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
    }
}
