package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AJAX
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");

        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadCalendar1_Top\"]/tbody/tr[2]/td[2]/a")).click();

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver,30);


        WebElement text1 = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_Label1\"]"));

        wait.until(ExpectedConditions.textToBePresentInElement(text1,"Monday, April 08, 2019"));


        System.out.println("done");

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
