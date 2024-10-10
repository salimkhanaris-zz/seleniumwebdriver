package day44;

import org.testng.annotations.Test;

public class PaymetnTests {

    @Test(priority = 1,groups = {"Sanity","Regression","Functional"})
    void paymentInRS()
    {
        System.out.println("Payment in RS");
    }
    @Test(priority = 2,groups = {"Sanity","Regression","Functional"})
    void paymentInUSD()
    {
        System.out.println("Payment in USD");
    }
    @Test(priority = 3,groups = {"Sanity","Regression","Functional"})
    void paymentIEUR()
    {
        System.out.println("Payment inEUR");
    }
}
