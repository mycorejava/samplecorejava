abstract class Abc
{
    abstract void show();
    abstract void show1();

}
abstract class Def extends  Abc
{
    void show()
    {
        System.out.println("implementation is given to abstract method with Def");
    }
    abstract void show2();
}
public class ExampleAbstract1 extends Def
{
    void show1()
    {
        System.out.println("implementation is given to abstract method");
    }
    void show2()
    {
        System.out.println("implementation is given to abstract method");
    }
    public static void main(String[] args)
    {
        ExampleAbstract1 e1 = new ExampleAbstract1();
        e1.show();


    }
}
