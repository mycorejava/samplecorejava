package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX16_Actions
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.demo.guru99.com/");
//        Thread.sleep(2000);
//
//
        Actions objactions = new Actions(driver);

//        WebElement e1 = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
//        WebElement e2 = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[3]/a"));
//        WebElement e3 = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a"));
//
//
//        objactions.moveToElement(e1).moveToElement(e2).moveToElement(e3).build().perform();
//
//        WebElement button = driver.findElement(By.name("btnLogin"));
//
//        objactions.contextClick(button);

//        driver.findElement(By.className("dropdown-toggle")).click();
//        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
//
//        WebElement src = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
//        WebElement dest = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
//
//        objactions.dragAndDrop(src,dest).build().perform();

//        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
//
//        WebElement button = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
//        WebElement t2 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
//        objactions.contextClick(button).moveToElement(t2).build().perform();
//
//
//        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
//        objactions.doubleClick(button2).build().perform();







        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
