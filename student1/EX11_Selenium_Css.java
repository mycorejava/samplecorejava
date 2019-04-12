import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX11_Selenium_Css
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.guru99.com/test/newtours/");


          //1)    tag[attribute='value']
//        driver.findElement(By.cssSelector("a[href='login.php']")).click();
////      driver.findElement(By.cssSelector("a[href='register.php']")).click();

          //driver.get("http://demo.guru99.com/test/login.html");
        //driver.manage().window().maximize();
        //Thread.sleep(3000);


          //2)   #id    and tag#id
//        driver.findElement(By.cssSelector("#email")).sendKeys("shiv");
//        driver.findElement(By.cssSelector("input#passwd")).sendKeys("password");


        //driver.get("http://demo.guru99.com/test/newtours/");

        //3) .class    and tag.class
//        String msg = driver.findElement(By.cssSelector(".footer")).getText();
//        System.out.println(msg);
//        String msg1 = driver.findElement(By.cssSelector("div.footer")).getText();
//        System.out.println(msg1);


        driver.get("https://www.toolsqa.com/automation-practice-form/");
        Thread.sleep(2000);

        //4) tag.class[attribute='vale']
//        String msg3 = driver.findElement(By.cssSelector("button.btn-info[name='submit']")).getText();
//        System.out.println(msg3);

        //5)  tag#id[attribute='value']
        //String msg4 = driver.findElement(By.cssSelector("button#submit[name='submit']")).getText();
        //System.out.println(msg4);

        //Substring matches (startswith ^    endswith $   contains  *)
        //tag[attribute<<operator>>=‘value’]

        //startswith ^
        //driver.findElement(By.cssSelector("input[id^=datepick]")).sendKeys("2apr");

        //endswith$
        //driver.findElement(By.cssSelector("input[id$=picker]")).sendKeys("2apr");

        //contains*
        //driver.findElement(By.cssSelector("input[id*=datepicker]")).sendKeys("2apr");
















    }
}
