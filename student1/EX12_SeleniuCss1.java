import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX12_SeleniuCss1
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        String msg = driver.findElement(By.cssSelector("div.button>button")).getText();
        System.out.println(msg);

        driver.close();
        driver.quit();



    }
}
