package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void pqr()
    {
        System.out.println("This is PQR Test");
    }

    @AfterSuite
    void AS()
    {
        System.out.println("This is after suite method");
    }
    @BeforeSuite
    void bs()
    {
        System.out.println("This is before suite method");
    }
}
