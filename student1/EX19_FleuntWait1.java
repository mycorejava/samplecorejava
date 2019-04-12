import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class EX19_FleuntWait1
{

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sh386257\\Downloads\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//click me to start timer button
        driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));

                String value = ele.getAttribute("innerHTML");

                if(value.equalsIgnoreCase("WebDriver"))
                {
                    return ele;
                }
                else
                {
                    System.out.println("default value on screen "+value);
                    return null;

                }
            }
        });
        System.out.println("element is displayed?? "+element.isDisplayed());
        driver.close();
        driver.quit();

    }

}
