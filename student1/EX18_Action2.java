package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX18_Action2
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sh386257\\Downloads\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        Thread.sleep(2000);

        WebElement e1 = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));


        Actions act =  new Actions(driver);

        act.dragAndDropBy(e1, 250, 250);

//		act.clickAndHold(e1).moveByOffset(250, 250).build().perform();
//		Thread.sleep(10000);


        driver.close();
        driver.quit();


    }

}
