package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions act =  new Actions(driver);

        act.sendKeys(Keys.PAGE_DOWN).build().perform();

        String def = driver.getWindowHandle();

        driver.findElement(By.id("win1")).click();
        Thread.sleep(2000);
        driver.switchTo().window(def);
        Thread.sleep(2000);
        driver.findElement(By.id("win2")).click();

        driver.switchTo().window(def);

        driver.findElement(By.name("enterText")).sendKeys("successful");

        Thread.sleep(10000);



        driver.close();
        driver.quit();

    }
}
