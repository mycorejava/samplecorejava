//super with method
class A1
{
    void show()
    {
        System.out.println("super method called");
    }
}

class ExampleSuper2 extends A1
{
    void show()
    {
        super.show();
        System.out.println("base method called");

    }


    public static void main(String args[])
    {
        ExampleSuper2 m=new ExampleSuper2();
        m.show();

    }
}
