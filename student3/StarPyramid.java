public class StarPyramid
{
    public static void main(String[] args)
    {
        char c = '*';
        int i, j;
        for (i=0; i<6 ; i++)
        {
            for(j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (i=6; i>=0 ; i--)
        {
            for(j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
