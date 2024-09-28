package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");
        //Select Departure City
        WebElement dc=driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select dc1= new Select(dc);
        dc1.selectByIndex(1);

        //Select Destination City
        WebElement desc=driver.findElement(By.xpath("//select[@name='toPort']"));
        Select desc1= new Select(dc);
        desc1.selectByIndex(1);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Find all rows
        List<WebElement> rows= driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));


        //Find size of columns
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td[6]"));
        System.out.println(columns.size());
        double minp=Double.MAX_VALUE;
        WebElement MinPriceRow=null;

        // Loop through the rows (starting from 1 to skip the header row)
        for (int i = 1; i < rows.size(); i++) {
            // Get all columns (td) for the current row
            List<WebElement> cells = rows.get(i).findElements(By.tagName("//table[@class='table']//thead//th"));

            // Get the price from the last column and parse it to double
            String priceText = cells.get(5).getText().replace("$", "");
            double price = Double.parseDouble(priceText);

            // Compare the price to find the minimum
            if (price < minp) {
                minp = price;
                MinPriceRow = rows.get(i);
            }
        }
        if (MinPriceRow!=null)
        {
            WebElement button = MinPriceRow.findElement(By.xpath("//table[@class='table']//tbody//td//input"));
            button.click();
        }
        //List<String> p= new ArrayList<>();

        //Print all flight prices

        //Collections.sort(prices, Comparator.comparing(WebElement::getText));

       /* for (WebElement x: prices)
        {
            System.out.println(x.getText());
        }*/
        //Printing sorted prices
        System.out.println("Done!!!");
        driver.quit();







    }
}
