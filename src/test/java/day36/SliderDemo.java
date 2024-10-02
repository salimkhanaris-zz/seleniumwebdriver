package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        WebElement min= driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Location of the minimum slider: "+min.getLocation().getX());  //(58,249)
        Actions act=new Actions(driver);
        act.dragAndDropBy(min,100,0).perform();
        System.out.println("Location of the minimum slider: "+min.getLocation().getX());  //161

        WebElement max= driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        act.dragAndDropBy(max,-40,0).perform();
        System.out.println("Location of the minimum slider: "+max.getLocation().getX());  //
    }
}
