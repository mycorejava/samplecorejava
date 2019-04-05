import java.util.Scanner;

public class SortWordsInSentence
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.println();
        String inputstring = scanner.nextLine();

        String temp;
        String[] words1 = inputstring.split("\\s");

        String outputString = "";

        for(int i=0;i<words1.length;i++)
        {
            for(int j=i+1;j<words1.length;j++)
            {

                if(words1[i].compareTo(words1[j])>0)
                {
                    temp =words1[i];
                    words1[i]=words1[j];
                    words1[j]=temp;

                }

                for(int i1=0;i1<=words1.length-1;i1++)
                {
                    System.out.print(words1[i]+"");

                }

            }

        }
    }
}
