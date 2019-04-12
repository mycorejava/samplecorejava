package com.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableImages
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-images");

        WebDriver driver = new ChromeDriver(co);
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);




        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
