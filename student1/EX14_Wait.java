package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EX14_Wait
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        Thread.sleep(8000);
        WebDriverWait wait=new WebDriverWait(driver, 20);

        //List<WebElement> titleElements = driver.findElements(By.cssSelector("a[target='_blank']"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".assistive-text")));

        driver.findElement(By.id("submit")).click();

        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong")));


        button.click();
    }
}
