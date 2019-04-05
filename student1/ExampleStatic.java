public class ExampleStatic
{

        public static void main(String args[])
        {
            Student2 s1 = new Student2();
            s1.showData();
            Student2 s2 = new Student2();
            s2.showData();
            Student2.b++;
            int a = s1.a + 10;
            s1.showData();
        }



}
class Student2
{
    int a; //initialized to zero
    static int b; //initialized to zero only when class is loaded not for each object created.

    Student2() {
        //Constructor incrementing static variable b
        b++;
    }

    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + Student2.b);
    }
//public static void increment(){
//a++;
//}
}