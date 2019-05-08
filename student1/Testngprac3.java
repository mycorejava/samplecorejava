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

public class Testngprac3
{
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass tesngprac3");
    }
    @BeforeMethod
    public  void beforemethod()
    {
        System.out.println("beforemethod tesngprac3");
    }
    @Test
    public void test1()
    {
        System.out.println("test1 tesngprac3");
    }
    @Test(groups = {"grp3"})
    public void test2()
    {
        System.out.println("test tesngprac3");
        System.out.println("grp3 ");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 tesngprac3");
    }
    @AfterMethod
    public  void aftermethod()
    {
        System.out.println("aftermethod tesngprac3");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass tesngprac3");
    }


}
