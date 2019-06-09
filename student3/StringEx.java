
public class StringEx
{
    public static void main (String args[])
    {
        String s = "Student";
        System.out.println("Print1: " +s);//Student
        s = "teacher";
        System.out.println("Print2: " +s);//teacher
        String s1 = "school";

        s.concat(s1);
        System.out.println("Print3: " +s);//teacher

        s = s.concat(s1);
        System.out.println("Print4: " +s);//teacherschool

        String s3 = "school";
        System.out.println(s1==s3); //true;

        s3 = "teacherschool";
        System.out.println(s1==s3);//false
        System.out.println(s==s3);// false..... because concat function returns a new String object; so when u do s.concat(s1) the result
        // is a new string object created in heap: its same as s = new String("teacherschool")

        s3 = "school";
        System.out.println(s1==s3);//true

        String s4 = "School";
        System.out.println(s3==s4);//false....case sensitive

        s4 = s4.toLowerCase();
        System.out.println("s4 " + s4); //school
        System.out.println(s3==s4);//false.....since toLowercase returns a new String

        String a = "cricketnfoodnTV";
        String b[] = a.split("n",0);
        for (String c:b)
        System.out.println(c);



    }
}
