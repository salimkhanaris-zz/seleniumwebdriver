package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    void testTitle()
    {
        String exp_title="Opencart";
        String act_title= "Openart";

/*        if (exp_title.equals(act_title))
        {
            System.out.println("Test Passed");
        }
        else
            System.out.println("Test Failed");*/
        //Assert.assertEquals(exp_title,act_title);

        //Using assertions along with the conditional statements
        if (exp_title.equals(act_title))
        {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test Failed");
            Assert.assertTrue(false);
        }

    }
}
