import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class EX02_Selenium2
{
    public static void main(String[] args)
    {

        System.setProperty(
                "webdriver.chrome.driver",
                "browser_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String baseUrl = "http://www.toolsqa.com";
        driver.get(baseUrl);
        driver.close();
    }
}
