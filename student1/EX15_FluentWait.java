package com.seleniumpractice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package


import com.google.common.base.Function;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX15_FluentWait {

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sh386257\\Downloads\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //click me to start timer button
        driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();

        WebDriverWait wait = new WebDriverWait(driver,30);


        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));





        Boolean status = element.isDisplayed();

        if(status)
        {
            System.out.println("element displayed");
        }
        else
        {
            System.out.println("element not displayed");
        }





    }
}