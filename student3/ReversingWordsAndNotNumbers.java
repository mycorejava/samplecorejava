import java.util.Scanner;

public class ReversingWordsAndNotNumbers
{
    public static void main(String[] args) {

        String str = "";
        Scanner in = new Scanner(System.in);
        String reverseString = "";

        System.out.println("Enter a String");
        str = in.nextLine();

        String splitArray[] = str.split(" ",str.length()-1);
        for(int i = 0; i<splitArray.length; i++)
        {
            for(int j=splitArray[i].length()-2; j>=0; j--)
            {
                reverseString = reverseString + Character.toString(splitArray[i].charAt(j));
            }

            reverseString = reverseString + Character.toString(splitArray[i].charAt(splitArray[i].length()-1)) + " ";
        }

        System.out.println(reverseString);

    }
}

