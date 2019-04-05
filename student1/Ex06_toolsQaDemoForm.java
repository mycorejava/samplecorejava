import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06_toolsQaDemoForm
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        Thread.sleep(1000);

        driver.manage().window().maximize();
        //Link Test
        WebElement element1 = driver.findElement(By.linkText("Link Test"));
        element1.click();
        driver.navigate().back();

        //Prtial link test
        WebElement element2 = driver.findElement(By.partialLinkText("Partial"));
        element2.click();

        //FirstName
        driver.findElement(By.name("firstname")).sendKeys("shiv");

        //Last Name
        driver.findElement(By.name("lastname")).sendKeys("nichal");

        //sex
        driver.findElement(By.id("sex-0")).click();

        //years of exp
        driver.findElement(By.id("exp-0")).click();

        //date
        driver.findElement(By.id("datepicker")).sendKeys("1april");

        //profession
        driver.findElement(By.id("profession-0")).click();

        //upload image
        //driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("download.jpg");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[26]/a")).click();


        //automation tool
        driver.findElement(By.id("tool-0")).click();

        //continents
        driver.findElement(By.id("continents")).sendKeys("Africa");

        //selenium commands
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

        //extracting text1
        WebElement text1 =  driver.findElement(By.xpath("//*[@id=\"NextedText\"]/span"));
        String text1msg = text1.getText();
        System.out.println("first text is "+text1msg);

        //submit button
        driver.findElement(By.id("submit")).click();

        driver.close();









    }
}
