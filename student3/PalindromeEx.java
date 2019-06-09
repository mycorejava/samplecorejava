import java.util.Scanner;

public class PalindromeEx {

    public static void main(String args[])
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a String to check if it is palindrome");

        String str  = sc.nextLine();
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            reverseStr = reverseStr+str.charAt(i);
            //System.out.println("reversed str: "+reverseStr);
        }

        System.out.println("Reversed String: " +reverseStr);

        if(str.equals(reverseStr))
        {
            System.out.println("The entered string is a palindrome");
        }
        else{System.out.println("The entered string is not a palindrome");}
    }
}
