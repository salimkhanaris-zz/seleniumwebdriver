package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathAxesDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //Self node
        String text= driver.findElement(By.xpath("//a[contains(text(),'MOIL')]/self::a")).getText();
        System.out.println("Text is "+text);

        //Parent Node
        text= driver.findElement(By.xpath("//a[contains(text(),'MOIL')]/parent::*")).getText();
        System.out.println(text);

        //Children- Selects all children of the current node
        List<WebElement> t1= driver.findElements(By.xpath("//a[contains(text(),'MOIL')]/ancestor::tr/child::td"));
        System.out.println("The number of children are: "+t1.size());

        //Ancestor - Selects all ancestors



        Thread.sleep(2000);
        driver.quit();
    }
}
