package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// Implicit wait
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> ids=driver.getWindowHandles();

        //To print IDS
        //Approach 1,

        for (String s:ids){
            System.out.println(s);
        }

        //Approach 2
        List<String> windowsids= new ArrayList<>(ids);
        String pid=windowsids.get(0);
        String cid= windowsids.get(1);

        //switch to child window
        driver.switchTo().window(cid);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //Switch to parent window
        driver.switchTo().window(pid);


        //driver.quit();
    }
}
