package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsD1 {

    @BeforeMethod
    void login()
    {
        System.out.println("Logged in");
    }
    @Test
    void search(){
        System.out.println("This is search");
    }
    @Test
    void advancedsearch(){
        System.out.println("Advanced Search");
    }
    @AfterMethod
    void logout()
    {
        System.out.println("This is logout");
    }
}
