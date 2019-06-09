public class StringBufferAndStringBuilder
{
    public static void main(String[] args) {

        String s = "Hello";
        concat1(s);
        System.out.println("String: " + s);

        StringBuilder s1 = new StringBuilder("Hello ");
        concat2(s1);
        System.out.println("String: " + s1);

        StringBuffer s2 = new StringBuffer("Hello ");
        concat3(s2);
        System.out.println("String: " + s2);


    }

    public static void concat1(String s)
    {
        s = s + "World";
    }

    public static void concat2(StringBuilder s)
    {
        s.append("World!");
    }

    public static void concat3(StringBuffer s)
    {
        s.append("World..Its a new day!");
    }
}
