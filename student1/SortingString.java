import java.util.Scanner;

public class SortingString
{
    public static void main(String[] args)
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner((System.in));


        System.out.println("Enter no of string you would like to sort");
        count = scan.nextInt();

        String str[]= new String[count];

        System.out.println("Enter string one by one");

        for(int i=0;i<count;i++)
        {
            str[i]=scan2.nextLine();
        }

        scan.close();
        scan2.close();


        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {

                if(str[i].compareTo(str[j])>0)
                {
                    temp =str[i];
                    str[i]=str[j];
                    str[j]=temp;

                }



            }

        }

        System.out.println("sorted string");

        for(int i=0;i<=count-1;i++)
        {
            System.out.println(str[i]);

        }

    }
}
