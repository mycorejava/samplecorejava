public class ExampleFinal
{
//    1.You can initialize a final variable when it is declared.
//      This approach is the most common.
//      A final variable is called blank final variable,if it is not initialized
//      while declaration. Below are the two ways to initialize a blank final variable.
//    2. A blank final variable can be initialized inside instance-initializer block or
//      inside constructor. If you have more than one constructor in your class then
//      it must be initialized in all of them, otherwise compile time error will be thrown.
//    A blank final static variable can be initialized inside static block.
    final int i;
    final String st;

    public ExampleFinal()
    {
        i=9;
        st="shiv";
    }
    public void display()
    {
        System.out.println(i+st);
    }
    public static void main(String[] args)
    {
        ExampleFinal e1=new ExampleFinal();
        e1.display();







    }
}
