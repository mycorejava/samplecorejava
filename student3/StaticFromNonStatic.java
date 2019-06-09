public class StaticFromNonStatic
{
    public static int staticVar = 10;

    public void nonStaticMethod()
    {
        System.out.println("Inside non static method " +staticVar);
        main(new StringEx[2]);
    }

    public static void main(StringEx args[])
    {
        System.out.println("Inside static main method");
    }
}
