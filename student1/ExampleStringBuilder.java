//this keyword with method
public class ExampleStringBuilder
{
    void simpleMethod1()
    {
        System.out.println("simple method 1 called");

    }
    void simpleMethod2()
    {
        this.simpleMethod1();
        System.out.println("simple method 2 also called");
    }

    public static void main(String[] args)
    {
        ExampleStringBuilder m= new ExampleStringBuilder();
        m.simpleMethod2();
    }
}
