package com.seleniumgridpractise;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
public class SeleniumGrid4
{
    public static void main(String[] args) throws Exception
    {

        WebDriver driver;
        String baseURL, hubURL;

        baseURL = "https://www.facebook.com/";
        hubURL = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(hubURL), capability);

        driver.get(baseURL);

        Thread.sleep(10000);

        String title = driver.getTitle();

        System.out.println("Title of 4th screen: "+title);

        driver.close();
        driver.quit();
    }
}

