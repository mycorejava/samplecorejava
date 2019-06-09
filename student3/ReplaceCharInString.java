public class ReplaceCharInString
{
    public static void main(StringEx args[])
    {
        String str = "hellopune";


        str.replace('l', 'k');
        System.out.println("Old StringEx: " +str);
        StringBuilder replacedString = new StringBuilder(str);
        replacedString.setCharAt(2, 'k');

        System.out.println("Repalced StringEx: " +replacedString);
    }
}
