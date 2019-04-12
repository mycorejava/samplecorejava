import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX19_JavaScriptHandler1
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com");
        driver.manage().window().maximize();


        JavascriptExecutor jx = (JavascriptExecutor)driver;

        jx.executeScript("window.scrollBy(0,250)","");
        jx.executeScript("window.scrollBy(0,document.body.scrollHeight)");

//        long start_time = System.currentTimeMillis();
//        jx.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
//        //Get the difference (currentTime - startTime)  of times.
//        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));





        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
