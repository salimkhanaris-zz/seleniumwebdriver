package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String [] args)
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isDisplayed
        WebElement bool= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        if(bool.isDisplayed()) {
            System.out.println("Element is present");
        }
        //isEnabled()
        boolean b1= driver.findElement(By.id("FirstName")).isEnabled();
        System.out.println("Element displayed: "+b1);

        //isSelected()
        b1= driver.findElement(By.xpath("//input[@value='M']")).isSelected();
        System.out.println("Status of the Radio box: "+b1);

        WebElement b2 = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        System.out.println("Status of the Radio box: "+ b2.isSelected());

        b2.click();
        System.out.println("Status of the Radio box: "+ b2.isSelected());




    }
}
