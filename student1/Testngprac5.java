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

public class Testngprac5
{
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass tesngprac5");
    }
    @BeforeMethod (groups = {"grp4","grp5"})
    public  void beforemethod()
    {
        System.out.println("beforemethod tesngprac5");
    }
    @BeforeMethod
    public  void beforemethodall()
    {
        System.out.println("beforemethod tesngprac5");
    }

    @Test
    public void test1()
    {
        System.out.println("test1 tesngprac5");
    }
    @Test(groups = {"grp4","grp5"})
    public void test2()
    {
        System.out.println("test2 tesngprac5");
        System.out.println("grp4 and grp5");
    }
    @Test
    public void test3()
    {
        System.out.println("test3 tesngprac5");
    }
    @AfterMethod
    public  void aftermethod()
    {
        System.out.println("aftermethod tesngprac5");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass tesngprac5");
    }


}
