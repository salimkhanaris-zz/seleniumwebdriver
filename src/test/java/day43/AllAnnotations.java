package day43;

import org.testng.annotations.*;

public class AllAnnotations {
    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("This is Before Suite Method");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("This is After Suite Method");
    }
    @BeforeTest
    void beforeTest()
    {
        System.out.println("This is Before Test Method");
    }
    @AfterTest
    void AfterTest()
    {
        System.out.println("This is After Test Method");
    }
    @BeforeClass
    void beforeClass()
    {
        System.out.println("This is Before Class Method");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This is After Class Method");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This is Before Method Method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This is After Method Method");
    }
    @Test
    void test1()
    {
        System.out.println("This is Test 1 Method ");
    }
    @Test
    void test2()
    {
        System.out.println("This is Test 2 Method ");
    }
}
