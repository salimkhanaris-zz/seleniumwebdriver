package day21;

/*

Test Case

        1. Launch a browser.
        2. Open URL demo.opencart.com.
        3. Validate Title
        4. Close browser

*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com");

        String title=driver.getTitle();
        System.out.println(title);
        if (title.equals("demosite")){
            System.out.println("Title Matches");
        }
        else System.out.println("Test Failed");
        Thread.sleep(3000);
        driver.quit();
    }
}
