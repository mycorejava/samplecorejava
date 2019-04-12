import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX10_SeleniumWebElements
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/test/login.html");

        driver.manage().window().maximize();

        //email textbox
        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("shiv");
        Thread.sleep(2000);
        element1.clear();

        //submit button
        WebElement element2 = driver.findElement(By.id("SubmitLogin"));
        element2.submit();

        Thread.sleep(1000);
        driver.navigate().back();

        //isDisplayed
        WebElement element3 = driver.findElement(By.id("SubmitLogin"));
        Boolean value1 = element3.isDisplayed();
        System.out.println("isDisplayed : "+value1);

        driver.get("https://www.toolsqa.com/automation-practice-form/");
        Thread.sleep(1000);

        //isSelected     years of exp radiobutton
        WebElement element4 = driver.findElement(By.id("exp-0"));
        Boolean value2 = element4.isSelected();
        System.out.println("isSelected : "+value2);

        //isEnabled         button
        WebElement element5 = driver.findElement(By.id("submit"));
        Boolean value3 = element4.isEnabled();
        System.out.println("button is not enabled isEnabled : "+value3);


        //getText
        String A = element5.getText();
        System.out.println("text of a button: "+A);

        //tagname
        String tagName = element5.getTagName();
        System.out.println("tag name is "+tagName);

        //getAttribute
        String getAttribute = element5.getAttribute("id");
        System.out.println("attribute is:  "+getAttribute);

        //getSize
        Dimension dimension = element5.getSize();
        System.out.println("dimension height"+dimension.height+"dimension width"+dimension.width);

        //getLocation
        Point point = element5.getLocation();
        System.out.println("x co-ordinated"+point.x);
        System.out.println("y co-ordinated"+point.y);

        //cssvalue
        String bgcolor = element5.getCssValue("backgroundColor");
        System.out.println("css value of background clr: "+bgcolor);

        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[18]")).findElement(By.id("exp-3"));
        element6.click();

        Thread.sleep(2000);

        driver.close();
        driver.quit();


    }
}
