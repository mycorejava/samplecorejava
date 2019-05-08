package testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class InvocationCount
{
    @BeforeTest
    public void beforetest()
    {
        System.out.println("before test called");
    }

//    @Test(invocationCount=2,invocationTimeOut= 5)
//    public void test() throws InterruptedException {
//        Thread.sleep(15000);
//        System.out.println("timeout");
//    }

    @Test(expectedExceptions = {InterruptedException.class,ArithmeticException.class})
    public void test1() throws InterruptedException
    {
        System.out.println("exception occured");
        int a=15;
        int b=0;
        int c=a/b;
        System.out.println(c);

        //throw new ArithmeticException();
        //if we do not write expected conditions it will give us java.lang.ArithmeticException: / by zero exception.
    }


    @AfterTest
    public void aftertest()
    {
        System.out.println("after test called");
    }
}
