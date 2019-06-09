public class BreakforForLoop
{
    public static void main(StringEx args[])
    {
        for(int i=0; i<=4; i++)
        {
            System.out.println("Inside first For loop" + i);
            for(int j = 0; j<=3; j++)
            {
                System.out.println("Inside 2nd For loop" + j);
                //if(i==2)
                //{break;}
            }
            if(i==2)
            {break;}
        }

        System.out.println("Out of the loops");
    }
}
