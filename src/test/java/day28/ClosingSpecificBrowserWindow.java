package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Implicit wait
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> ids=driver.getWindowHandles();

        for (String wid:ids){
            String title=driver.switchTo().window(wid).getTitle();
            System.out.println(title);

            if (title.equals("Human Resources Management Software | OrangeHRM")){
                driver.close();
            }
        }
    }
}
