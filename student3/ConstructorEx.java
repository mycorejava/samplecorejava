public class ConstructorEx
{
    ConstructorEx()
    {
        System.out.println("Calling non parameterized constructor");
    }

    ConstructorEx(String s)
    {
        System.out.println(s);
    }

    ConstructorEx(int i, String s)
    {
        System.out.println(s + " for " + i+"st time.");
    }

    public static void main(String args[])
    {
        ConstructorEx ex1 = new ConstructorEx();
        ConstructorEx ex2 = new ConstructorEx("Calling a parameterized constructor with single parameter");
        ConstructorEx ex3 = new ConstructorEx(1, "Calling a parameterized constructor with two arguments" );
    }
}
