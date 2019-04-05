import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX04_Navigation
{
    public static void main(String[] args)
    {
    System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String url ="https://www.toolsqa.com/";
    driver.get(url);
    driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span")).click();

    driver.navigate().back();

    driver.navigate().forward();

    driver.navigate().refresh();
    }

}
