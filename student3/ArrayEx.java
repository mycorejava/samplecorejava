public class ArrayEx
{
    public static void main(StringEx args[])
    {
        int[][] arr = {{1,2}, {4, 3}, {5,6}};
        System.out.println(arr.length);

        for(int i = 0; i<3; i++ )
        {
            for (int j = 0; j<2; j++)
            {
                int a = arr[i][j];
                if((a%2)==0)
                {
                    //System.out.println(arr[i][j]);

                }
            }
        }
    }
}
