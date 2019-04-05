import java.util.Scanner;
public class ExampleScanner1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter name");
        String userName = sc.nextLine();  // Read user input

        System.out.println("Enter gender");
        char G = sc.next().charAt(0);

        System.out.println("Enter age");
        int age =sc.nextInt();


        System.out.println("Enter mobile nor");
        long mobno = sc.nextLong();


        System.out.println("Enter CGPA");
        double cgpa = sc.nextDouble();





        System.out.println("Username is: " + userName);  // Output user input
        System.out.println("Gender is: " + G);
        System.out.println("Age is: " + age);
        System.out.println("Mobile number is: " + mobno);
        System.out.println("CGPA is: " + cgpa);

    }
}
