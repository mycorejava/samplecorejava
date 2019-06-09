public class PrefixEx
{
    public static void main(StringEx args[])
    {
        int p = 4;
        int a = -2;
        int x;

        --p; // value of p here 3
        System.out.println(p++); //At this line p is assigned value of 3 and then decremented. so at this line p is 3
        x = p--;  // At this line p now becomes 4. Value of p i.e 4 is assigned to x first and then p is decremented
        System.out.println(x);// At this line now x becomes 4 and p becomes 3

        System.out.println(p++ * 2);// At this line p is 3, so 3 * 2=6
        System.out.println(p); // p now becomes 4

        System.out.println(--p * 4);// Here p is first decremented and then assigned the value. so at this line p is 3, 3*4=12
        System.out.println(p);

    }
}
