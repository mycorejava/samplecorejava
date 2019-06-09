public class Child extends Parent
{
    String name;

    void detail()
    {
        super.name = "ParentName1";
        name = "ChildName";
        System.out.println(super.name + ", "  +name);
    }

    public static void main(String args[])
    {
        Child child = new Child();
        child.detail();

    }
}
