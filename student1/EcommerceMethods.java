package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceMethods
{
    @Test
    public  void openBrowser()
    {
        System.out.println("browser will open");
    }

    @Test(dependsOnMethods = {"signIn","openBrowser"})
    public  void checkOut()
    {
        System.out.println("check out ");
    }
    @Test(dependsOnMethods = {"openBrowser"})
    public  void signIn()
    {
        System.out.println("sign in ");
        Assert.fail();
    }

    @Test
    public void asignOut()
    {
        System.out.println("sign out ");
    }
}
