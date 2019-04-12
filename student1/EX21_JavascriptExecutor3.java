import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX21_JavascriptExecutor3
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236063%7Ce%7Cfacebook%7C&placement=&creative=318504236063&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9040229%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwqLblBRBYEiwAV3pCJiATrlXkM5PTs076QBvOh6OEZyKYo3tvcTMprUosZsLWNcoeEcAaQhoCsyMQAvD_BwE");

        js.executeScript("document.getElementById('u_0_k').value='shiv';");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_12\"]"));


        js.executeScript("arguments[0].click();", login);



        Thread.sleep(2000);








        driver.close();
        driver.quit();

    }

}
