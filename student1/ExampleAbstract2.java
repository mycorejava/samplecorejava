//Calling non-abstract method of a abstract class
abstract class A3
{
    void show()
    {
        System.out.println("non-absract method of a abstract class called");
    }

}

class ExampleAbstract2 extends A3
{
    void show1()
    {
        show();

        System.out.println("2nd method also called");

    }


    public static void main(String args[])
    {
        ExampleAbstract2 m=new ExampleAbstract2();
        m.show1();

    }
}