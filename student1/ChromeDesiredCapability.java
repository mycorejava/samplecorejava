

    public WebDriver initChromeBrowser(boolean bLoadImages){
        String strOSType = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        if(!bLoadImages) {
            prefs.put("profile.managed_default_content_settings.images", 2);
        }
        ChromeOptions objChromeOptions = new ChromeOptions();
        objChromeOptions.setExperimentalOption("prefs", prefs);
        objChromeOptions.addArguments("--incognito");
        objChromeOptions.addArguments("--disable-popup-blocking");
        objChromeOptions.addArguments("--no-sandbox");
        objChromeOptions.addArguments("--disable-dev-shm-usage");
        if(strOSType.contains("nux")){objChromeOptions.setBinary(path_chromelinux);}
        if(strOSType.contains("mac")){objChromeOptions.setBinary(path_chromemac);}
        DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
        chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, objChromeOptions);

        if(strOSType.contains("win")){path_chromedriver = path_chromedriver + ".exe";}
        if(strOSType.contains("nux")){new File(path_chromedriver).setExecutable(true);}
        if(strOSType.contains("mac")){new File(path_chromedriver).setExecutable(true);}
        System.setProperty("webdriver.chrome.driver",path_chromedriver);

        WebDriver driverLocal= new ChromeDriver(chromeCapabilities);
        driverLocal.manage().window().setPosition(new Point(2,2));
        driverLocal.manage().window().setSize(new Dimension(1500,840));
        driverLocal.manage().deleteAllCookies();
        return driverLocal;
    }
