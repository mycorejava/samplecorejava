import java.util.*;
public class ExampleArrayofObject
{
    public String empData(){
        return "Ramesh" + "25";
    }

    public void add(int a,int b)
    {
        int addition = a+b;
        System.out.println(addition);
    }
    public void sub(int c,int d)
    {
        int subtraction = c-d;
        System.out.println(subtraction);
    }
    public void mul(int e,int f)
    {
        int multiplication = e*f;
        System.out.println(multiplication);
    }
    public void div(int g,int h)
    {

        int division = g*h;
        System.out.println(division);
    }

    static int dd = 99;
    int mm = 99;
    public static void add2(int a, int b){

        ExampleArrayofObject.dd = 56;
        int addition = a+b;
        System.out.println(addition);
    }

    public ExampleArrayofObject addd3(){
        ExampleArrayofObject.dd = 25;
        System.out.println(ExampleArrayofObject.dd);
        //ExampleArrayofObject newObj = new ExampleArrayofObject();
        ExampleArrayofObject newObj = null;
        return null;
    }

    public static void main(String args[]){
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();
        //Student.b++;
        //s1.showData();
    }
}

class Student {
    int a; //initialized to zero
    static int b; //initialized to zero only when class is loaded not for each object created.

    Student(){
        //Constructor incrementing static variable b
        b++;
    }

    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
//public static void increment(){
//a++;
//}
}
