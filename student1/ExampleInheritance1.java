class Employee
{

    private void any()
    {

    }
    void empname()
    {

        System.out.println("employee name: shivprasad");
    }
}

class Organization extends Employee
{
    void orgname()
    {

    System.out.println("organization name: wipro");
    }
}

class Employeefinance extends Employee
{
    void salary()
    {
        System.out.println("employee salary 4000: wipro");
    }
}



public class ExampleInheritance1
{

    public static void main(String[] args)
    {
        Organization o1 = new Organization();

        o1.empname();
        o1.orgname();


        Employeefinance e1 = new Employeefinance();

        e1.empname();
        e1.salary();


    }

}
