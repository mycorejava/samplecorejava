package testng1;

import org.testng.annotations.Test;

public class PriorityExample
{
    @Test(priority = 20)
    public void test1()
    {
        System.out.println("test1 ");
    }
    @Test(priority = 0)
    public void test3()
    {
        System.out.println("test3 ");
    }
    @Test(priority = 0)
    public void test2()
    {
        System.out.println("test2 ");
    }
    @Test(enabled = false)
    public void test4()
    {
        System.out.println("test4 ");
    }

}
