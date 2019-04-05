public class ExampleConstructor
{
    ExampleConstructor()
    {
        System.out.println("empty constructor called");
    }
    ExampleConstructor(String s)
    {
        this();
        System.out.println(s);
    }
    ExampleConstructor(int num){
        this("sample 123");
        System.out.println(num);

    }

    public static void main(String[] args) {
        //ExampleConstructor e1= new ExampleConstructor("parameter constructor is also called");
        ExampleConstructor e2= new ExampleConstructor(25);
    }

}
