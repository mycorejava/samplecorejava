public class example1
{
    public void add(int x, int y)
    {
        int sum = x + y;
        System.out.println(sum);
    }

    public void mul(int s,int r)

    {
        int multi=s*r;

         String ans = Integer.toString(multi);

        System.out.println(ans);

    }

    public boolean divide(int a, int b)
    {
        int div = a /b;

        if(div> 0)
        {
            System.out.println("positive");
            return true;
        }
        else
        {
            System.out.println("negative");
            return false;
        }




    }



    public static void main(String args[])
    {


        example1 e = new example1();
        e.add(8,1);

        example1 e1=new example1();
        e.divide(3,3);

        example1 e2 = new example1();
        e2.mul(5,5);



    }
}
