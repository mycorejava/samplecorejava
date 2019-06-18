

        driver.get("https://github.com/");
        thread.sleep(15000);
        driver.findElement(By.id("user[login]"));
        driver.findElement(By.name("user[email]"));
        driver.findElement(By.linkText("Marketplace"));
        driver.findElements(By.tagName("input")).size();

        driver.get("https://www.wikipedia.org/");
        thread.sleep(15000);
        driver.findElement(By.partialLinkText("Foundation"));

        driver.get("https://www.facebook.com/");
        thread.sleep(15000);
        driver.findElement(By.className("inputtext"));
        driver.findElement(By.cssSelector("a[title='Go to Facebook home']"));

        driver.get("http://demo.guru99.com/v1/");
        thread.sleep(15000);
        driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.xpath("//img[@src='/logo.png']"));
        driver.findElement(By.xpath("//*[contains(@name,'btn')]"));
        driver.findElement(By.xpath("//td[text()='UserID']"));
