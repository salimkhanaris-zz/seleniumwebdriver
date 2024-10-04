package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Zoom Level
        js.executeScript("document.body.style.zoom='50%'");

        //Single File Upload

        /*driver.findElement(By.xpath("//input[@id='filesToUpload']"))
                .sendKeys("C:\\Users\\MK106566\\Downloads\\test.txt");
        String fname=driver.findElement(By.xpath("//ul[@id='fileList']//li"))
                .getText();
        if (fname.equals("test.txt"))
        {
            System.out.println("File is Uploaded");
        }*/

        //Multi file Upload
        String file1= "C:\\Users\\MK106566\\Downloads\\test.txt";
        String file2= "C:\\Users\\MK106566\\Downloads\\test2.txt";
        driver.findElement(By.xpath("//input[@id='filesToUpload']"))
                .sendKeys(file1+"\n"+file2);
        System.out.println("Multiple Files Uploaded");
        int fileCount=driver.findElements(By.xpath("//ul[@id='fileList']//li"))
                .size();
        if (fileCount==2){
            System.out.println("All Files are uploaded");
        }




    }
}
