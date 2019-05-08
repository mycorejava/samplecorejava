package testng1;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Testngprac1
{
    @BeforeClass
    public void beforeclass()
    {
       System.out.println("beforeclass tesngprac1");
    }
    @BeforeMethod
    public  void beforemethod()
    {
        System.out.println("beforemethod tesngprac1");
    }
    @Test(groups = {"grp1"})

    public void test1()
    {
        System.out.println("test1 tesngprac1");
        System.out.println("grp1 ");
    }
    @Test
    public void test2()
    {
        System.out.println("test2 tesngprac1");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 tesngprac1");
    }
    @AfterMethod
    public  void aftermethod()
    {
        System.out.println("aftermethod tesngprac1");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass tesngprac1");
    }


}
