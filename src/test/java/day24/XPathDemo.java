package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        //XPath with a single attribute
        //driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Tablet");

        //XPath with multiple attributes

        //driver.findElement(By.xpath(("//input[@name='search'][@placeholder='Search']"))).sendKeys("Tablet");

        //XPath with 'and' 'or'

        //driver.findElement(By.xpath(("//input[@name='search' and @placeholder='Search']"))).sendKeys("Tablet");
        //driver.findElement(By.xpath(("//input[@name='search' or @placeholder='Search']"))).sendKeys("Tablet");

        //XPath with inner textmethod- //a[text()='value']
        WebElement b= driver.findElement(By.xpath("//a[text()='MacBook']"));
        //Thread.sleep(6000);
        if (b.isDisplayed())
        {
            System.out.println("The element is visible");
        }
        WebElement c= driver.findElement(By.xpath("//*[text()='Featured']"));
        System.out.println("The captured text is: "+c.getText());

        //xpath with contains- //tagname[contains(@attribute,'partial or full value')]
        //driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Test");

        //xpath with starts -with()
        //driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("Test2");

        //Chained xPath
        boolean bool= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(bool);

        Thread.sleep(2000);
        driver.quit();
    }
}
