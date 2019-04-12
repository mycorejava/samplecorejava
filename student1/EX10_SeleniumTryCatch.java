import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX10_SeleniumTryCatch
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
        String driverName = "ie";
        try {
            if (driverName=="chrome")
            {
                System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
                try{
                driver = new ChromeDriver();}
                catch(Exception e){}
            }
            else if(driverName=="firefox")
            {
                System.setProperty("webdriver.firefox.marionette","browser_driver\\geckodriver.exe");
                driver = new FirefoxDriver();
            }

        }

        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
        finally
        {
        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);

        driver.close();
        driver.quit();
        }





    }
}
