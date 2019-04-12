import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX12_BrowserOption
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-infobars");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.youtube.com/");

    }
}
