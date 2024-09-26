package day28;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //WebDriverWait newwait= new WebDriverWait(driver, Duration.ofSeconds(5));
        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input(@id='Wikipedia1_wikipedia-search-input')"))
          //      .sendKeys("Selenium");
        WebElement box= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[(@id='Wikipedia1_wikipedia-search-input')]")));
        box.sendKeys("Selenium");
        driver.findElement(By.className("wikipedia-search-button"))
                .click();
        List<WebElement> links= mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[(@class= 'wikipedia-search-results')]/child::div/a")));
        //driver.findElements(By.id("wikipedia-search-result-link"));
        System.out.println("Number of links are "+ links.size());

        /*for (int i=0;i<= links.size();i++)
        {
        String handle= driver.getWindowHandle();

        String link= links.get(i).get
        driver.navigate().to(link);
        }*/

        for (WebElement link:links){
            //String url= link.getAttribute("href");
            link.click();

            //driver.switchTo().window(wh);
        }
        Set<String> ids=driver.getWindowHandles();
        System.out.println(ids);
        List<String> windowsids= new ArrayList<>(ids);
        for (int i=0;i< windowsids.size();i++)
        {
            WebDriver title= driver.switchTo().window(windowsids.get(i));
            System.out.println("Title of the webpage is: "+title.getTitle());
        }
        String tab= windowsids.get(3);
        driver.switchTo().window(tab);
        driver.close();
        System.out.println("Closed the windows with id: "+tab);

        //driver.quit();
    }
}
