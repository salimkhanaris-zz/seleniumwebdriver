package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWOPageFactory
{
    WebDriver driver;
    // 1. Constructor

    LoginPageWOPageFactory(WebDriver driver)
    {
        this.driver=driver;
    }
    // 2. Locators

    By username= By.xpath("//input[@placeholder='Username']");
    By password= By.xpath("//input[@placeholder='Password']");
    By loginbutton= By.xpath("//button[@type='submit']");


    //3. Action Methods

    public void setUsername(String user)
    {
        driver.findElement(username).sendKeys(user);
    }
    public void setPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLogin()
    {
        driver.findElement(loginbutton).click();
    }
}
