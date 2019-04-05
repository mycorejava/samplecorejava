class Anyclass
{
    //1st step create static object of a class
    static Anyclass obj = null; //new Anyclass();
    //2nd step created private default constructor
    private Anyclass(int a)
    {
    }


    //3rd return object in public static method.
    public static Anyclass getInstance()
    {
        System.out.println("instance created only once");
        return obj;
    }


}




public class Singleton
{

    public static void main(String[] args)
    {
        Anyclass obj1 = Anyclass.getInstance();

    }

}
