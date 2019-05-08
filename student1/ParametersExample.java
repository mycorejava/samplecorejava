package testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample
{
    @Test
    @Parameters({"cityname"})
    public void test1(String cityname)
    {
        System.out.println("cityname: "+cityname);
    }
    @Test
    @Parameters({"empid","age"})
    public void test2(String empid,int age)
    {
        System.out.println("empid "+empid+" age: "+age);
    }
}
