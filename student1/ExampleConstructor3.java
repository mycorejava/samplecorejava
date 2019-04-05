class Base1
{
    Base1(int a,int b)
    {
        System.out.println("constructor of a base class");
    }
}

public class ExampleConstructor3 extends Base1
{
    ExampleConstructor3()
    {
        super(2,3);
        System.out.println("constructor of a derived class");
    }
    public static void main(String[] args)
    {
        ExampleConstructor3 e3 = new ExampleConstructor3();
    }
}
