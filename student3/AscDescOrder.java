public class AscDescOrder
{
    public static void main(String args[])
    {
        String wordArray[] = {"Mango", "Apple", "Banana", "Kiwi"};
        for(String array: wordArray)
        {
            System.out.println(array);
        }

        for (int i=0; i<=wordArray.length; i++)
        {
            for(int j=1; j<wordArray.length;j++)
            {
                if(wordArray[j-1].compareTo(wordArray[j])>0)
                {
                    String temp = wordArray[j-1];
                    wordArray[j-1] = wordArray[j];
                    wordArray[j] = temp;
                }
            }
        }

        System.out.println("The sorted order is:");
        for(int i=0; i<wordArray.length; i++)
        {
            System.out.println(wordArray[i]);
        }

    }
}
