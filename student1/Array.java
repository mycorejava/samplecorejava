public class Array
{
    public static void main(String args[])throws Exception
    {

        String[] strArray1 = new String[3];

        strArray1[0] = "ethans";
        strArray1[1] = "ethans";
        strArray1[2] = "ethans";
        //strArray1[4] = "ethans";


        for (int i = 0; i < strArray1.length; i++)
        {
            System.out.print(strArray1[i]);
        }

/*
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        for (int i = 0; i < intArray.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ intArray[i]);
*/

    }
}
