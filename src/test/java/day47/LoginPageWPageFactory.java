package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPageWPageFactory
{
    // 1. Constructor
    WebDriver driver;


    LoginPageWPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this); //Mandatory
    }
    // 2. Locators

    /*By username= By.xpath("//input[@placeholder='Username']");
    By password= By.xpath("//input[@placeholder='Password']");
    By loginbutton= By.xpath("//button[@type='submit']");*/

    //@FindBy(xpath = "//input[@placeholder='Username']") WebElement username;

    //2nd Approach of using FIndBy
    @FindBy(how= How.XPATH, using = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']") WebElement password;

    @FindBy(xpath = "//button[@type='submit']") WebElement loginbutton;

    @FindBy(tagName = "a")
    List<WebElement> links;

    //3. Action Methods

    public void setUsername(String user)
    {
        username.sendKeys(user);
    }
    public void setPassword(String pass)
    {
        password.sendKeys(pass);
    }
    public void clickLogin()
    {
        loginbutton.click();
    }
}
