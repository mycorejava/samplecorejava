import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class EX01_Selenium1
{
    public static void main(String[] args)
    {
        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\Users\\Shree\\IdeaProjects\\Project3\\browser_driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String baseUrl = "http://www.toolsqa.com";
        driver.get(baseUrl);
        driver.close();

    }
}
