
interface fastfood
{
    public void sauce();
}

interface sandwich
{
    public void name();
}



public class Interface2 implements fastfood,sandwich
{
    public void sauce()
    {
        System.out.println("with schezwan sauce");
    }
    public void name()
    {
        System.out.println("cheese sandwich");
    }

    public static void main(String[] args)
    {
        Interface2 i2 =new Interface2();
        i2.name();
        i2.sauce();
    }

}