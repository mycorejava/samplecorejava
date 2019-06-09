import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class CapabilityPrg {
    public String path_chromedriver = "browser_driver//chromedriver";
    public String path_gecodriver = "browserDriver//geckodriver_automation";

    public final String path_chromelinux = "/opt/google/chrome/chrome";
    public final String path_chromewindows = "";
    public final String path_chromemac = "";

    public final String path_firefoxlinux = "";
    public final String path_firefoxwindows = "";
    public final String path_firefoxmac = "";


    public WebDriver initChromeBrowser(boolean bLoadImages) {
        String strOSType = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        if (!bLoadImages) {
            prefs.put("profile.managed_default_content_settings.images", 2);
        }
        ChromeOptions objChromeOptions = new ChromeOptions();
        objChromeOptions.setExperimentalOption("prefs", prefs);
        objChromeOptions.addArguments("--incognito");
        objChromeOptions.addArguments("--disable-popup-blocking");
        objChromeOptions.addArguments("--no-sandbox");
        objChromeOptions.addArguments("--disable-dev-shm-usage");
        if (strOSType.contains("nux")) {
            objChromeOptions.setBinary(path_chromelinux);
        }
        if (strOSType.contains("mac")) {
            objChromeOptions.setBinary(path_chromemac);
        }
        DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
        chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, objChromeOptions);

        if (strOSType.contains("win")) {
            path_chromedriver = path_chromedriver + ".exe";
        }
        if (strOSType.contains("nux")) {
            new File(path_chromedriver).setExecutable(true);
        }
        if (strOSType.contains("mac")) {
            new File(path_chromedriver).setExecutable(true);
        }
        System.setProperty("webdriver.chrome.driver", path_chromedriver);

        WebDriver driverLocal = new ChromeDriver(chromeCapabilities);
        driverLocal.manage().window().setPosition(new Point(2, 2));
        driverLocal.manage().window().setSize(new Dimension(1500, 840));
        driverLocal.manage().deleteAllCookies();
        return driverLocal;
    }


    public static void main(String[] args) throws InterruptedException {
        CapabilityPrg cp = new CapabilityPrg();
		
        WebDriver driver = cp.initChromeBrowser(false);

        driver.get("https://www.amazon.com/");

        Thread.sleep(10000);
    }
}