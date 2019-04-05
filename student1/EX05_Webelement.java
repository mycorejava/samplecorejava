import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EX05_Webelement
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","browser_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.india.com/account/login");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));

//        //sendkeys
//        element1.sendKeys("shiv");
//        //clear
//        element1.clear();

        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/div/ul/li[2]/a"));
        //click
        element2.click();

        //isDisplayed
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/div/ul/li[2]/a"));
        Boolean value1 = element3.isDisplayed();
        System.out.println("isDisplayed : "+value1);

        //isSelected
        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"user_accepted_tou\"]"));
        Boolean value2 = element4.isSelected();
        System.out.println("isSelected : "+value2);

        //isEnabled
        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"new_user\"]/fieldset[7]/button/span"));
        Boolean value3 = element4.isEnabled();
        System.out.println("button is not enabled isEnabled : "+value3);

        //submit
        WebElement sumitButton = driver.findElement(By.xpath("//*[@id=\"new_user\"]/fieldset[7]/button/span"));
        sumitButton.submit();

        //getText
        WebElement msg = driver .findElement(By.xpath("//*[@id=\"content\"]/div/div/div/ol"));
        String A = msg.getText();

        System.out.println("msg captured from getText(): ");
        System.out.println(A);

        String tagName = sumitButton.getTagName();
        System.out.println("tag name is "+tagName);
//
//
//        String getAttribute = sumitButton.getAttribute("xpath");
//        System.out.println("attribute is "+getAttribute);
//
//        Dimension dimension = sumitButton.getSize();
//        System.out.println("dimension height"+dimension.height+"dimension width"+dimension.width);
//
//        Point point = sumitButton.getLocation();
//        System.out.println("x co-ordinated"+point.x);
//        System.out.println("y co-ordinated"+point.y);

    }
}
