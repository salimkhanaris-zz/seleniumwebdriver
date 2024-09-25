package day25OpenPlaylistToLearnMore;

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
        String text= driver.findElement(By.xpath("//a[contains(text(),'PCBL')]/self::a")).getText();
        System.out.println("Text is "+text);

        //Parent Node
        text= driver.findElement(By.xpath("//a[contains(text(),'PCBL')]/parent::*")).getText();
        System.out.println(text);

        //Children- Selects all children of the current node
        List<WebElement> t1= driver.findElements(By.xpath("//a[contains(text(),'PCBL')]/ancestor::tr/child::td"));
        System.out.println("The number of children are: "+t1.size());

        //Ancestor- Finds all ancestors
        t1= driver.findElements(By.xpath("//a[contains(text(),'PCBL')]/ancestor::*"));
        System.out.println("Ancestor size: "+t1.size());

        //Descendants
        t1=driver.findElements(By.xpath("//a[contains(text(),'PCBL')]/ancestor::*/descendant::tr"));
        System.out.println("Number of Descendants: "+t1.size());

        //Preceding Sibling- Selects all sibling before the selected node

        t1=driver.findElements(By.xpath("//a[contains(text(),'PCBL')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of Preceding siblings are: "+t1.size());

        Thread.sleep(2000);
        driver.quit();
    }
}
