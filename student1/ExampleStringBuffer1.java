//this keyword with variable
public class ExampleStringBuffer1
{
    int i=10;
    void fun()
    {
        int i=5;
        System.out.println("local variable"+i);
        System.out.println("instantiated variable"+this.i);

    }
    public static void main(String[] args)
    {
        ExampleStringBuffer1 e=new ExampleStringBuffer1();
        e.fun();
    }
}
