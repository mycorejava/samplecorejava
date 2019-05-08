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

public class Testngprac4
{
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass tesngprac4");
    }
    @BeforeMethod
    public  void beforemethod()
    {
        System.out.println("beforemethod tesngprac4");
    }
    @Test
    public void test1()
    {
        System.out.println("test1 tesngprac4");
    }
    @Test(groups = {"grp4"})
    public void test2()
    {
        System.out.println("test2 tesngprac4");
        System.out.println("grp4 ");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 tesngprac4");
    }
    @AfterMethod
    public  void aftermethod()
    {
        System.out.println("aftermethod tesngprac4");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass tesngprac4");
    }


}
