public class NoOfWordsInString
{
    public static void main(String[] args) {

        String s = "this!@ is a  . String.";
        String words[]= s.split(" ");
        System.out.println("Number of words: " + words.length);
        int wordCount;
        int count = 0;
        int count1 = 0;
        int nonAlphabeticChar = 0;
        for(int i=0; i<=words.length-1; i++)
        {

            if(words[i].matches("[a-zA-Z]*$"))
            {
                count = count + words[i].length();
                System.out.println("Count:  " + count);
            }
            else
            {
                System.out.println("In else condition");
                for(int j = 0; j<=words[i].length()-1; j++ )
                {
                    char c = words[i].charAt(j);
                    if(Character.toString(c).matches("[a-zA-Z]*$"))
                    {
                        count1 = count1 +1;
                        System.out.println("Count1:  "  + count1);
                    }

                    else{
                        nonAlphabeticChar = nonAlphabeticChar + 1;

                    }

                    //System.out.println("NonAlphabetical Char: " + nonAlphabeticChar);
                }

                //int nonAlphabeticChar = words[i].length() - count1;
                //System.out.println("NonAlphabetical Char: " + nonAlphabeticChar);
                //totalCount = words[i].length() - nonAlphabeticChar;

            }
        }

        wordCount = count + count1;
        System.out.println("FinalCount: " +count + " FinalCount1: " + count1);
        System.out.println("NonAlphabetical Char: " + nonAlphabeticChar);
        System.out.println("Number of Letters: " + wordCount);
    }
}
