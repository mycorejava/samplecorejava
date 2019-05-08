package com.seleniumgridpractise;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
HUB:
java -jar selenium-server-standalone-2.53.0.jar -role hub

NODE1: chrome
java -Dwebdriver.chrome.driver=C:\Users\Shree\IdeaProjects\Project3\browser_driver\chromedriver.exe -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4444/grid/register -port 5555 -browser browserName=chrome,maxInstance=3

NODE2:firefox
java -Dwebdriver.gecko.driver=C:\Users\Shree\IdeaProjects\Project3\browser_driver\geckodriver.exe -jar selenium-server-standalone-2.53.0.jar -role node -hub http://localhost:4444/grid/register -port 6666 -browser browserName=firefox,maxInstance=3
 */
public class SeleniumGrid1
{
    public static void main(String[] args)throws Exception
    {
        WebDriver driver;
        String baseURL, hubURL;

        baseURL = "http://demo.guru99.com/test/guru99home/";
        hubURL = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(hubURL), capability);

        driver.get(baseURL);

        Thread.sleep(10000);

        WebElement e1 = driver.findElement(By.xpath("//*[@id=\"rt-header\"]/div/div[2]/div/ul/li[1]/a"));
        String msg = e1.getText();

        Thread.sleep(10000);

       if(msg.equalsIgnoreCase("home"))
       {
         System.out.println("text is home");
       }
       else
       {
           System.out.println("text is not home");
       }
        driver.close();
        driver.quit();
    }
}
