package com.testngpractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

public class Testng2
{
    public WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shree\\IdeaProjects\\Project3\\browser_driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod()
    {
        driver.navigate().to("http://demo.guru99.com/");
        try{Thread.sleep(10000);}catch(Exception e){}
    }
    @Test
    public void test1()
    {
        driver.findElement(By.name("btnLogin")).click();
        try{Thread.sleep(5000);}catch(Exception e){}
    }
    @Test
    public void test2()
    {
        driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
        try{Thread.sleep(5000);}catch(Exception e){}
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.navigate().back();
    }
    @AfterClass
    public void afterClass()
    {
        driver.close();
        //driver.quit();
    }

}
