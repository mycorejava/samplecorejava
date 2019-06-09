public class ConstructorChainingEx
{
    int a = 2;
    int b = 3;

    ConstructorChainingEx()
    {
        this(1);
        System.out.println("The default constructor is called");
    }

    ConstructorChainingEx(int i)
    {
        this(1,2);
        System.out.println("Parameterized constructor called for " + i + " times.");
    }

    ConstructorChainingEx(int a, int b)
    {
        //this();
        System.out.println(this.a * this.b);
        System.out.println("Calling constructor with two args.");
    }

    public static void main(String args[])
    {
        ConstructorChainingEx ex1 = new ConstructorChainingEx();
        ConstructorChainingEx ex2 = new ConstructorChainingEx(1);
        ConstructorChainingEx ex3 = new ConstructorChainingEx(1,2);
    }

}
