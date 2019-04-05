public class RevString
{
    public static void main(String[] args)

    {


        String name=" ";
        String rev=null;
        int len= name.length();

        for(int i=len-1;i>=0;i--)
        {
            rev = rev+name.charAt(i);


        }
        System.out.println(rev);

    }
}
