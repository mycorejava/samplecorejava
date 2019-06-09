import java.util.Scanner;

public class comparission {

    Scanner in = new Scanner(System.in);

   void checkIntValue()
    {
        String intValue = in.nextLine();
        try {

                 int num = Integer.parseInt(intValue);
                 System.out.println("You entered integer value " + num);


        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer value");
            checkIntValue();
        }

    }

    public static void main(String args[]) {

        comparission comp = new comparission();

        System.out.println("Enter a StringEx value");
        String s = comp.in.nextLine();
        System.out.println("You entered string " + s);

        System.out.println("Enter an integer value");

        comp.checkIntValue();
    }
}