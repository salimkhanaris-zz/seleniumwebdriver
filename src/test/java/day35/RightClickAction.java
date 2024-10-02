package day35;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class RightClickAction {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act= new Actions(driver);

        //Right Click
        act.contextClick(button).perform();

        //Click on Copy
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();

        //Close alert
        Alert myalert= driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();


        //Click on Copy

    }
}
