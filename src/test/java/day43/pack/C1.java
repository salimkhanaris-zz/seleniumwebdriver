package day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc()
    {
        System.out.println("This is abc method");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("This is bt Before Test method");
    }

}
