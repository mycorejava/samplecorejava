package com.seleniumpractice;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EX21_jquery {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click me to start timer']")));

        WebElement button = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        untilJqueryIsDone(driver);

        //untilPageLoadComplete(driver);

        String msg = driver.findElement(By.id("demo")).getText();
        System.out.println(msg);
    }

    public static void untilJqueryIsDone(WebDriver driver){
            Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
            if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
    }

    public static void untilPageLoadComplete(WebDriver driver){
            Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            if (!isPageLoaded) System.out.println("Document is loading");
    }

}
