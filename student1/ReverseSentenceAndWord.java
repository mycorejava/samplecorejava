public class ReverseSentenceAndWord
{
    public static void main(String[] args)
    {
        String blogName = "how to do in java";
        StringBuilder reverseString = new StringBuilder();

        String[] words = blogName.split(" ");       //step 1

        for (String word : words)
        {
            String reverseWord = new StringBuilder(word).reverse().toString();      //step 2
            reverseString.append(reverseWord + " ");                                //step 3
        }
        String inputString = reverseString.toString().trim();
        System.out.println( "Reversed words "+inputString );

        String[] words1 = inputString.split("\\s");

        String outputString = "";

        for (int i = words1.length-1; i >= 0; i--)
        {
            outputString = outputString + words1[i] + " ";
        }
        System.out.println("reversed words sentence "+outputString);
    }
}
