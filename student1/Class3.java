import java.lang.reflect.Array;

public class Class3
{

    public static void main(String args[])
    {
        //Integer
        System.out.println("------------------Integer--------------");
        Integer a1= 15;
        Integer a2= 10;
        /*compare (x,y)
        returns 0 if (x==y)
        returns 1 if(x>y)
        returns-1 if(x<y)
        */
        System.out.println(Integer.compare(a2, a1));
        //bitCount converts the arg into binary and calculates no. of bits in the binary
        System.out.println(Integer.bitCount(a1));

        //Float
        System.out.println("------------------Float--------------");
        Float f1 = 1.5f;
        Float f2= 2.5f;
        System.out.println(Float.max(f1, f2));
        System.out.println(Float.sum(f1, f2));

        //Character
        System.out.println("------------------Character--------------");
        Character d='x';
        System.out.println(Character.toUpperCase(d));
        System.out.println(Character.charCount(d));

        //Double
        System.out.println("------------------Double--------------");
        Double db1 = 88.2;
        System.out.println(Double.doubleToLongBits(db1));
        System.out.println(Double.toString(db1));

        //Boolean
        System.out.println("------------------Boolean--------------");
        Boolean bl1 =false;
        Boolean bl2 =false;
        System.out.println(Boolean.compare(bl1,bl2));
        System.out.println(Boolean.valueOf(bl1));






    }
}
