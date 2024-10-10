package day44;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1,groups = {"Sanity"})
    void loginByEmail()
    {
        System.out.println("This is Login by email");
    }
    @Test(priority = 2,groups = {"Sanity"})
    void loginByFB()
    {
        System.out.println("This is Login by FB");
    }
    @Test(priority = 3,groups = {"Sanity"})
    void loginByTwitter()
    {
        System.out.println("This is Login by Twitter");
    }
}
