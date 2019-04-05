import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX08_SelectDriver
{
    public static WebDriver driver = null;

    void selectDriver(String driverName)
    {
        switch(driverName)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.firefox.marionette","browser_driver\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default :
                System.out.println("not valid drivername");
                driver=null;
                break;
        }
    }
    public static void main(String[] args)
    {
        EX08_SelectDriver s = new EX08_SelectDriver();
        s.selectDriver("chrome");
        driver.get("https://www.google.com");



    }
}
