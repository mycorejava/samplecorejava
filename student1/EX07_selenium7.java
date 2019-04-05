import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EX07_selenium7
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);

        driver.manage().window().maximize();

        Thread.sleep(1000);
//        //contact us
//        driver.findElement(By.id("contact-link")).click();
//
//
//        Thread.sleep(1000);
//        //sign in
//        driver.findElement(By.className("header_user_info")).click();
//
//        //footer enter email i news letter textbox
//        driver.findElement(By.id("newsletter-input")).sendKeys("shivnichal23@gmail.com");
//
//        //click on serach
//        driver.findElement(By.name("submitNewsletter")).click();
//
//        Thread.sleep(2000);
//
//        WebElement alert = driver.findElement(By.className("alert-danger"));
//        String errmsg = alert.getText();
//        System.out.println(errmsg);
//
//        //footer women
//        driver.findElement(By.className("last")).click();
//
//        List<WebElement> element1 = driver.findElements(By.className("replace-2x"));
//        System.out.println("Number of elements:" +element1.size());


        //clcking on popular tab
        driver.findElement(By.className("homefeatured")).click();

        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")).click();

        driver.findElement(By.className("fancybox-close")).click();


        Thread.sleep(2000);
        //clicking on best seller tab

        driver.findElement(By.className("blockbestsellers")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"blockbestsellers\"]/li[3]/div/div[1]/div/a[1]/img")).click();

        driver.findElement(By.className("fancybox-close")).click();


        Thread.sleep(1000);
        //slider
        driver.findElement(By.className("bx-next")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("bx-next")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("bx-next")).click();
        Thread.sleep(2000);




        driver.close();
        driver.quit();

    }
}
