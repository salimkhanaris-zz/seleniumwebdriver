package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Select one checkbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //Select Multiple Checkboxes
       /* List <WebElement> cb=driver.findElements(By.xpath("//input[(@class='form-check-input' and @type='checkbox')]"));
        for (WebElement cbo:cb){
            cbo.click();
        }*/
        //Select last 3 checkboxes
        List <WebElement> cb1=driver.findElements(By.xpath("//input[(@class='form-check-input' and @type='checkbox')]"));
        //This is done when we dont know the size
/*        for (int i= cb1.size()-3;i<cb1.size();i++)
        {
            cb1.get(i).click();
        }*/
        //When we know the size
        //for (int i=4;i< cb1.size();i++){
          //  cb1.get(i).click();
       // }

     //Select first 3 checkboxes
/*   for (int i= 0;i<cb1.size()-4;i++)
        {
            cb1.get(i).click();
        }*/
    //Unselect checkboxes if they are selected
    for (int i= 0;i<cb1.size()-4;i++)
        {
            cb1.get(i).click();
        }
    for (int i=0;i<cb1.size();i++)
    {
        if (cb1.get(i).isSelected())
        {
            cb1.get(i).click();
        }
    }


    }
}
