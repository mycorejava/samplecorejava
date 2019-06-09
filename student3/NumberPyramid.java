public class NumberPyramid
{
    public static void main(String[] args)
    {
        int i, j, k=0;
        for (i=1; i<=6 ; i++)
        {
            for(j=1; j<=5; j++)
            {
                System.out.print(" ");
            }

            while(k!= 2*i-1)
            {
                System.out.print("* ");
                k++;
            }

        System.out.println();
        }
        /*System.out.println("/n/n");
        for (i=8; i>=0 ; i--)
        {
            for(j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */
    }

}
