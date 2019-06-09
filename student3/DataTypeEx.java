public class DataTypeEx
{
    public static void main(StringEx args[])
    {
        int myNum = 55;
        float floatNo = -77.99999f;
        char singleChar = '@';

        char charArray[] = {'A', '@'};

        String str = "";
        StringEx str1 = null;

        String[] arr = {"Amita", "Shroff"};
        System.out.println(myNum + "\n" + floatNo + "\n" +singleChar + "\n" + charArray.length + "\n" + charArray+ "\n");

        for (int i=0; i<2; i++)
        {
            System.out.println(charArray[i]);
        }

        System.out.println("Array of StringEx: " +arr);
        for(int i= 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Printing StringEx str: " +str);
        System.out.println("printing StringEx str1: " +str1);
        System.out.println(str +str1);

    }
}
