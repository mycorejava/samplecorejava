//default,parameter constructor
public class ExampleConstructor1
{
    ExampleConstructor1()
    {
        System.out.println("this is default constructor");
    }
    ExampleConstructor1(int a)
    {
        System.out.println("this is one parammeter constructor");
    }
    ExampleConstructor1(int b,int c)
    {
        System.out.println("this is three parammeter constructor ");
    }

    public static void main(String[] args)
    {
        new ExampleConstructor1();
       new ExampleConstructor1(1);
        new ExampleConstructor1(2,3);
    }


}
