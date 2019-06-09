public class ForLoopEx
{
    public static void main(StringEx args[])
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Printing in reverse order: " );
        for(int j=10 ; j>=0; j--)
        {
            System.out.println(j);
        }

        System.out.println("Printing even numbers:");
        for(int j=10 ; j>=0; j--)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }

        System.out.println("prinitng in reverse from 20 to 15");
        for(int j=20 ; j>=15; j--)
        {
            System.out.println(j);
        }

        System.out.println("prinitng from -3 to 9");
        for(int j=-3 ; j<=9; j++)
        {
            System.out.println(j);
        }

        System.out.println("prinitng from -3 to 9 if number%2>0");
        for(int j=-3 ; j<=9; j++)
        {
            if(j%3>0) {
                System.out.println(j);
            }
        }

        System.out.println("prinitng table of 3");
        for(int i=1; i<=10; i++)
        {
            int j = 0;
             j = 3*i;
            System.out.println(j);
        }



    }
}
