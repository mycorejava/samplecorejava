package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ComboClass
{
    @DataProvider(name = "Authentication")

    public static Object[][] credentials() {

        return new Object[][]
                {
                        { "testuser_1", "Test@123" }
                };

    }
    public WebDriver driver;

    @BeforeTest
    public void beforetest() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\IdeaProjects\\browser_drivers_all\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }


    @Test(dataProvider = "Authentication")
    @Parameters({"date"})
    public void test1(String firstname,String lastname,String date) throws InterruptedException
    {
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        Thread.sleep(3000);

        driver.findElement(By.name("lastname")).sendKeys(lastname);
        Thread.sleep(3000);

        driver.findElement(By.id("datepicker")).sendKeys(date);
        Thread.sleep(3000);


    }

    @AfterTest
    public void aftertest()
    {
        driver.close();
        driver.quit();
    }

}
