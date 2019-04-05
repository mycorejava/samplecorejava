public class ExampleStringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer s1=new StringBuffer("ethans");
        int len=s1.length();
        int cap=s1.capacity();
        System.out.println("Capacity is: "+cap+" and Length is "+len);

        StringBuffer s2=new StringBuffer("ethans");
        s2.append("pune");
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("Sv");
        s3.insert(1, "hi");
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("Baner");
        s4.reverse();
        System.out.println(s4);

        StringBuffer s5 = new StringBuffer("01234567");
        s5.delete(0, 5);
        System.out.println(s5);

        StringBuffer s6 = new StringBuffer("01234567");
        s6.deleteCharAt(7);
        System.out.println(s6);

        StringBuffer s = new StringBuffer("GeeksforGeeks");
        s.replace(5, 8, "are");
        System.out.println(s);
    }
}
