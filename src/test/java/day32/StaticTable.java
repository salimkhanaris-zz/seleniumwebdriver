package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //find total number of rows in the table

        //List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        //System.out.println(rows.size());
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rows);

        //Find total number of columns in a table
        int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(col);

        //Read data from specific row and column (ex: 5th row and 1st col)
        /*WebElement value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]"));
        System.out.println(value.getText());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row number");
        int rw= sc.nextInt();
        System.out.println("Enter col number");
        int cl= sc.nextInt();
        String val1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+rw+"]//td["+cl+"]")).getText();
        System.out.println(val1);
*/
        //Read data from all rows and columns

/*        for (int r=2;r<=rows;r++)
        {
            for (int c=2;c<=col;c++)
            {
                String val=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(val+"   ");
            }
            System.out.println();
        }*/

        //Print data on a specific condition

        for (int r=2;r<=rows;r++)
        {
            String aname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(aname.equals("Mukesh"))
            {
                String name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println(name);
            }
            //System.out.println(aname);
        }

        //Find total price of all the books
        int total=0;
        for (int c=2;c<=rows;c++)
        {
            String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+c+"]//td[4]")).getText();
            int p= Integer.parseInt(price);
            //System.out.println(p);

            total=total+p;

        }
        System.out.println("The total cost is: "+total);




        driver.quit();

    }
}
