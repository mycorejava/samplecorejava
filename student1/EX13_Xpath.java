import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX13_Xpath
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // relative xpath
        //driver.findElement(By.xpath("//span[text()='Blogs']")).click();

        //driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sp");


        //tag[contains(@attribute, ‘value‘)]
        //driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("shiv");


        //Example      
        //driver.findElement(By.xpath("//div[@class='control-group']//input[@name='firstname']")).sendKeys("shiv");

        //AND
        // driver.findElement(By.xpath("//*[@type='text' and @name='firstname']")).sendKeys("shiv");

        //OR




        //tag[starts-with(@attribute, ‘value‘)]
        //driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys("shiv");



       // driver.close();
       // driver.quit();



    }
}
