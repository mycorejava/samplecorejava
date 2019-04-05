public class ExampleStatic1
{
    int rollno = 0;
    String name = null;
    //only need to change college value at one place
    static String college = "ITS";

    ExampleStatic1(int r, String n) {
        rollno = r;
        name = n;
    }

    void display()
    {
        System.out.println(rollno + " " + name + " " + ExampleStatic1.college);
    }

    public static void main(String[] args)
    {
        ExampleStatic1.college = "newITS";
        ExampleStatic1 e1 = new ExampleStatic1(111,"Karan");
        ExampleStatic1 e2 = new ExampleStatic1(222,"Aryan");

        e1.display();
        e2.display();

    }
}
