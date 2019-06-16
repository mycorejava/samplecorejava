import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWebDriverWait {

    public static WebDriver driver;

    public static void main(String[] args) throws Exception {

        // Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\IdeaProjects\\Latest\\browser_driver\\geckodriver.exe");
        driver = new FirefoxDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception


        // Launch the URL

        driver.get("https://demoqa.com/");

        Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.cssSelector("a[href='https://demoqa.com/tooltip-and-double-click/']")).click();
        Thread.sleep(20000);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("doubleClickBtn")) );

        driver.close();

    }

}
