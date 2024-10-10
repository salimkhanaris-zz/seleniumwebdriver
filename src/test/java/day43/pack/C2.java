package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void ghi()
    {
        System.out.println("This is ghi");
    }

    @AfterTest
    void at()
    {
        System.out.println("This is JKL After Test");
    }
}
