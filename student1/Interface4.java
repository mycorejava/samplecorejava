// with defauly keyword we can have non-abstract methods in an interface.
interface defaultkeyword
{
    default void test()
    {
        System.out.println("non-abstract method");
    }
}



public class Interface4 implements defaultkeyword
{

    public static void main(String[] args)
    {
        Interface4 i4 = new Interface4();
        i4.test();

    }

}