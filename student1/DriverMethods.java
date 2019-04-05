import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverMethods
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);


        driver.navigate().to("http://www.demo.guru99.com/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

        String url = driver.getCurrentUrl();
        System.out.println("getCurrentUrl"+url);

        String title = driver.getTitle();
        System.out.println("getTitle:"+title);

        String pgsrc = driver.getPageSource();
        System.out.println("getPageSource"+pgsrc);




        String attr = driver.findElement(By.name("lastname")).getAttribute("type");
        System.out.println("attribute: "+attr);

        String handle = driver.getWindowHandle();
        System.out.println(handle);

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

//        int hashcode = driver.hashCode();
//        System.out.println("hashcode"+hashcode);
//
//        String tostr = driver.toString();
//        System.out.println("toString"+tostr);

        WebElement sumitButton = driver.findElement(By.id("submit"));
        Dimension dimension = sumitButton.getSize();
        System.out.println("dimension height"+dimension.height+"dimension width"+dimension.width);

        Point point = sumitButton.getLocation();
        System.out.println("x co-ordinated"+point.x);
        System.out.println("y co-ordinated"+point.y);

        driver.close();
        driver.quit();

    }
}
