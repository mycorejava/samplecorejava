package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Frames
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/iframe-practice-page/");

        Thread.sleep(25000);
        Actions act =  new Actions(driver);


        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.switchTo().frame("IF2");

        String msg = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/h3")).getText();
        System.out.println("msg: "+msg);

        driver.switchTo().defaultContent();

        Thread.sleep(5000);

        driver.switchTo().frame("IF1");

        driver.findElement(By.name("firstname")).sendKeys(msg);
        Thread.sleep(5000);


        driver.close();
        driver.quit();


    }
}
