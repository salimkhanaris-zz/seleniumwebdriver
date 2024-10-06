package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        //Capture all links from website

        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("Total Links are "+links.size());
        int noofbrl=0;
        for (WebElement x: links)
        {
            String value= x.getAttribute("href");
            if (value == null || value.isEmpty())
            {
                System.out.println("Not possible to check");
                continue;
            }
            //hit URL to Set
            try {
                URL linkurl= new URL(value); //Converted href value from String to URL
                HttpURLConnection conlink= (HttpURLConnection) linkurl.openConnection(); //Open connection to the server
                conlink.connect();

                if (conlink.getResponseCode()>=400)
                {
                    System.out.println("Broken Link");
                    noofbrl++;
                }
                else
                    System.out.println("Not a broken link");
            } catch (Exception e) {

            }

        }
        System.out.println(noofbrl);
    }
}
