class New
{
    String college = "VSIT";



}
public class ExampleSuper extends New
{
String college ="VSITlocal";
    public void simpleMethoid(){
        System.out.println(super.college);
        System.out.println(college);
    }
    public static void main(String[] args)
    {
        ExampleSuper e1 = new ExampleSuper();
        e1.simpleMethoid();
    }
}

