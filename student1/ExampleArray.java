public class ExampleArray
{
    //4d array

    public static void main(String []args)
    {

        int four[][][][] = new int[2][2][2][2];
        int i,j,k,l;
        for (i=0; i<2; i++)
            for (j=0; j<2; j++)
                for (k=0; k<2; k++)
                    for (l=0; l<2; l++)
                    {
                        //four[i][j][k][l]= (i+1)*(j+1)*(k+1)*(l+1);
                        System.out.println(four[i][j][k][l]);
                    }
        System.out.println("");


    }
}
