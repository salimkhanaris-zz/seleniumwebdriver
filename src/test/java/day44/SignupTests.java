package day44;

import org.testng.annotations.Test;

public class SignupTests {
    @Test(priority = 1,groups = {"Regression"})
    void signupByEmail()
    {
        System.out.println("This is signup by email");
    }

    @Test(priority = 2,groups = {"Regression"})
    void signupByFB()
    {
        System.out.println("This is signup by FB");
    }

    @Test(priority = 3,groups = {"Regression"})
    void signupByTwitter()
    {
        System.out.println("This is signup by twitter");
    }
}
