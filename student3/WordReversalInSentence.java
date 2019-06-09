import java.util.Scanner;

public class WordReversalInSentence
{
    public static void main(String[] args) {
        String str = "";
        char eachChar[];
        char reverseChar[];
        String reversedWord = "";

        System.out.println("Enter a string to be reversed");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

       String splitArray[] = str.split(" ", str.length()-1);
       for(int i=0; i<splitArray.length; i++)
       {
           int wordLength = splitArray[i].length();
           //System.out.println(splitArray[i]);

           for(int j=splitArray[i].length()-1; j>=0; j--)
           {
               //System.out.println("Inside loop");
               reversedWord = reversedWord + Character.toString(splitArray[i].charAt(j));
              // System.out.println(reversedWord);

           }

           reversedWord = reversedWord + ' ';
       }

        System.out.println(reversedWord);


    }
}
