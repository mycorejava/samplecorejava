public class SubStringMethod {

    public static void main(StringEx args[]) {


    String str = "Java";
    System.out.println("str: " +str.hashCode());

    //StringEx str1 = "amita";
    //System.out.println("str1: " +str1.hashCode());

    String str2 = new String("Java");
    //System.out.println("str2: " +str2.hashCode());

    System.out.println(str.equals(str2));

    //StringEx str3 = new StringEx("amita");
    //System.out.println("str3: " +str3.hashCode());

        String s="java";

        System.out.println("value of s ==  "+s.hashCode()+"\n\n");
        System.out.println(s);

        s = "java programming";  // s can not be changed (immutablity)
        System.out.println(s);
        //System.out.println(" hashcode of s == "+s.hashCode());"java "

}
}
