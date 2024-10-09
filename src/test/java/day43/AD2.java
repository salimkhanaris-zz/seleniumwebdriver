package day43;

import org.testng.annotations.*;

public class AD2 {

    @BeforeClass
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
    @AfterClass
    void logout()
    {
        System.out.println("This is logout");
    }
}
