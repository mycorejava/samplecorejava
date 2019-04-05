class Person
        {
            int age = 34;

           void walk()
           {
               System.out.println("walks slow");
           }
        }
 class Employee1 extends Person
        {
            int age = 45;
            void walk()
            {
                System.out.println("walks faster");
            }
        }

public class ExampleInheritance2 extends Employee1
{
    int age = 70;
    void walk()
    {
        System.out.println("walks fastest");
    }

    void run()
    {
        System.out.println("running");
    }

    public static void main(String[] args)
    {
        ExampleInheritance2 ee = new ExampleInheritance2();
        ee.walk();
        ee.run();
        System.out.println(ee.age);

        Person p= new ExampleInheritance2();
        p.walk();
        ((ExampleInheritance2) p).run();
        System.out.println(p.age);


    }
}
