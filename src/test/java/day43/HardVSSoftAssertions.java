package day43;

import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSSoftAssertions {

    

    @Test
    void test_hardassert()
    {
        System.out.println("Testing");
        System.out.println("Testing");
        Assert.assertEquals(1,2); //hardassertion

        System.out.println("Testing");
        System.out.println("Testing");
    }

    @Test
    void test_softassert()
    {
        System.out.println("Testing");
        System.out.println("Testing");

        //SoftAssert
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1,2);
        System.out.println("Testing");
        System.out.println("Testing");

        sa.assertAll(); // mandatory for soft assertions
    }
}
