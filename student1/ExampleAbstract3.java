//abstract class with final method
abstract class A4
{
    final void show()
    {
        System.out.println("final method called");
    }

}

class ExampleAbstract3 extends A4
{
    void show1()
    {
        show();

        System.out.println("2nd method also called");

    }


    public static void main(String args[])
    {
        ExampleAbstract3 m=new ExampleAbstract3();
        m.show1();

    }
}