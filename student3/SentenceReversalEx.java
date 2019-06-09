import java.util.Scanner;

public class SentenceReversalEx
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a Sentence to be reversed");

        String str  = sc.nextLine();
        String reverseStr = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            //System.out.println("Inside for loop");
            if(str.charAt(i) == ' ')
            {
                reverseStr = reverseStr + ' ';
                continue;
            }

            else {
                reverseStr = reverseStr + str.charAt(i);
                //System.out.println(reverseStr);
                //System.out.println("reversed str: "+reverseStr);
            }
        }

        System.out.println("Reversed String: " +reverseStr);
    }
}
