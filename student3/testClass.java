package pckg1.pckg12;

public class testClass implements in1 {
    @Override
    public void display()
    {
        System.out.println("Display");
    }

    public static void main(String[] args) {

        testClass t = new testClass();
        t.display();
        System.out.println(testClass.i);

    }
}
