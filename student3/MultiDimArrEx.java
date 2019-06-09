public class MultiDimArrEx
{
    public static void main(StringEx args[])
    {
        int[][] multiDimArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        //System.out.println(multiDimArr[2][0]+ "\n");

        for (int a = 0; a<3; a++)
        {
           // System.out.println("Printing 2nd column of array: " +multiDimArr[a][1]);
        }

        char[][] charArray= {{'A', 'B', 'C'}, {'C', 'D', 'E'}, {'K', 'L', 'P'}};
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if(charArray[i][j]=='C')
                {
                    //System.out.println(i+"," +j);
                    System.out.println(charArray[i][j]);
                    System.out.println(charArray[i]);
                }
            }
        }

    }
}


























































