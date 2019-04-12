public class ThirdOddNumber
{
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int newArr[];
        newArr = new int[20];
        int count=0;

        for(int i=0;i<arr.length;i++)
        {

            if (arr[i]%2!=0)

            {

                    newArr[count] = arr[i];
                    count++;

            }
        }

        for (int k=0;k<newArr.length;k++)
        {
            System.out.println(newArr[k]);



        }

        System.out.println("third odd number is"+newArr[2]);












    }
}
