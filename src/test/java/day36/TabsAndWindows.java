package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabsAndWindows {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        //Open new tab and open the URL- Selenium 4.x+
        driver.switchTo().newWindow(WindowType.TAB);

        //to open a new browser window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");

    }
}
