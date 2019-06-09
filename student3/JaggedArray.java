import java.util.Arrays;

public class JaggedArray
{
    public static void main(StringEx args[])
    {
        int [][] jaggedArray = new int [3][];
        jaggedArray[0] = new int[] {1,2};
        jaggedArray[1] = new int[] {3,4,5};
        jaggedArray[2] = new int[] {6,7,8,9};

        System.out.println("Jagged Array: " +jaggedArray.length);

        for (int array[] : jaggedArray)
        {
            System.out.println(Arrays.toString(array));
        }
    }
}
