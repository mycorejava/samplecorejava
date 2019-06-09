public class SwitchEx
{
    public static void main(String args[])
    {
        String str = "one";

        switch (str)
        {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            case "four":
                System.out.println("four");
                break;
            default:
                System.out.println("no match found");
                    break;
        }
    }
}
