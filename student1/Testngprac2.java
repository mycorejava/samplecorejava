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

public class Testngprac2
{
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass tesngprac2");
    }
    @BeforeMethod
    public  void beforemethod()
    {
        System.out.println("beforemethod tesngprac2");
    }
    @Test
    public void test1()
    {
        System.out.println("test1 tesngprac2");
    }
    @Test(groups = {"grp2"})
    public void test2()
    {
        System.out.println("test2 tesngprac2");
        System.out.println("grp2 ");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 tesngprac2");
    }
    @AfterMethod
    public  void aftermethod()
    {
        System.out.println("aftermethod tesngprac2");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass tesngprac2");
    }


}
