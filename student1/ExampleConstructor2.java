//constructor chaining
public class ExampleConstructor2
{
    ExampleConstructor2()
    {
        System.out.println("this is default constructor");
    }
    ExampleConstructor2(int q)
    {
        this();
        System.out.println("this is one parammeter constructor");
    }
    ExampleConstructor2(int r,int s)
    {
        this(3);
        System.out.println("this is two parammeter constructor");
    }

    public static void main(String[] args)
    {
        new ExampleConstructor2(5,6);
    }



}
