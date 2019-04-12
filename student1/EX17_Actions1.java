package com.seleniumpractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX17_Actions1
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sh386257\\Downloads\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        Actions act =  new Actions(driver);

        //three times page down
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();

        Thread.sleep(2000);

        //three times page up
        act.sendKeys(Keys.PAGE_UP).build().perform();
        act.sendKeys(Keys.PAGE_UP).build().perform();
        act.sendKeys(Keys.PAGE_UP).build().perform();

        Thread.sleep(2000);


        driver.close();
        driver.quit();






    }
}
