public class TryCatchEg
{
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int result;
        try
        {
            result = i/j;
            System.out.println(i/j);
        }

       /* catch (ArithmeticException e)
        {
            System.out.println("exception caught");
            //e.printStackTrace();
        }
        catch (Exception e)
        {
            //System.out.println("exception caught");
            e.printStackTrace();
        } */

        catch (NumberFormatException|ArithmeticException|NullPointerException e)
        {
            System.out.println("exception caught");
            //e.printStackTrace();
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}
