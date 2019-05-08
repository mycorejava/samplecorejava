package com.seleniumgridpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SeleniumGrid2
{
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        String baseURL, hubURL;

        baseURL = "http://demo.guru99.com/";
        hubURL = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(hubURL), capability);

        driver.get(baseURL);

        Thread.sleep(10000);

        WebElement e2 = driver.findElement(By.xpath("//*[@id=\"site-name\"]/a"));
        String msg2 =e2.getText();

        System.out.println("title of second screen is : "+msg2);

        driver.close();
        driver.quit();

    }
}
