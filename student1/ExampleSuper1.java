class Base
{
    void display(){
        System.out.println("Child method Called");
    }

}
public class ExampleSuper1 extends Base

{
    void show()
    {
        System.out.println("Parent method Called");
    super.display();
    }

    public static void main(String[] args)
    {
        ExampleSuper1 s1= new ExampleSuper1();
        s1.show();
    }
}
