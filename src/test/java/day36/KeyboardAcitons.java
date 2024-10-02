package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAcitons {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        driver.findElement(By.xpath("//textarea[@id='inputText1']"))
                .sendKeys("Testing");
        Actions act= new Actions(driver);
        //CRT+A/CMD A
        act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();
        //CTRL C or CMD C
        act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();
        //Tab- shift to next box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //CTRL V or CMD V
        act.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();

        driver.findElement(By.xpath("//div[@class='compareButtonText']")).click();
        WebElement identext= driver.findElement(By.xpath("//span[@class='messageForUser']"));
        System.out.println(identext.getText());
    }
}
