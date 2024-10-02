package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement copybutton= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions act= new Actions(driver);
        box1.clear();
        box1.sendKeys("Testing");
        act.doubleClick(copybutton).perform();

        if (box2.getAttribute("value").equals("Testing")){
            System.out.println("text is copied");
        }
        else{
            System.out.println("Text not copied");
        }


        act.dragAndDrop(source,target).perform();
        String text= driver.findElement(By.xpath("//div[@id='droppable']")).getText();
        if (text.equals("Dropped!")){
            System.out.println("Item is dropped correctly");
        }
        else {
            System.out.println("Try again");
        }



    }
}
