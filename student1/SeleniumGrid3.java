package com.seleniumgridpractise;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SeleniumGrid3
{
    public static void main(String[] args) throws Exception
    {
        WebDriver driver;
        String baseURL, hubURL;

        baseURL = "https://www.youtube.com/";
        hubURL = "http://127.0.0.1:4444/wd/hub";

        FirefoxOptions options = new FirefoxOptions();

        DesiredCapabilities capability = DesiredCapabilities.firefox();

        options.merge(capability);
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WIN10);

        driver = new RemoteWebDriver(new URL(hubURL), capability);

        driver.get(baseURL);

        Thread.sleep(10000);

        String title = driver.getTitle();

        System.out.println("Title of 3rd screen: "+title);

        driver.close();
        driver.quit();



    }
}
