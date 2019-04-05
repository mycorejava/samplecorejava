public class ExampleMergeArray
{
    //merge two arrays

    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};


        int len1=arr1.length;
        int len2=arr2.length;

        int len=len1+len2;

        int arr[]=new int[len];


        for(int i=0;i<len1;i++)
        {
            arr[i]=arr1[i];
        }

        for(int i=0;i<len2;i++)
        {
            arr[len1+i]=arr2[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
