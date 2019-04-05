public class NumberPyramid3
{
    public static void main(String[] args)
    {

        int a=1;

        for(int i=1;i<=5;i++)
        {
            int k=0;
            for(int j=1;j<=a;j++)
            {

                if(j<=i)
                {
                    k=k+1;
                }
                else
                {
                    k=k-1;
                }

                System.out.print(k);
            }

            System.out.println();
            a=a+1;
        }




    }
}
