package testng1;

import org.testng.annotations.*;

public class InvocationClass1
{
    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("before method test called");
    }
    @BeforeTest
    public void beforetest()
    {
        System.out.println("before test called");
    }
    @Test(invocationCount = 7)
    public void test()
    {
        System.out.println("test method called");
    }

    @AfterTest
    public void aftertest()
    {
        System.out.println("after test called");
    }
    @AfterMethod
    public void aftermethod()
    {
        System.out.println("aftermethod test called");
    }
}
