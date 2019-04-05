interface employeeemployee
{
    public String name();
}

interface employeesalary
{
    public int salary();
}

interface employeeprofile
{
    public String profile();
}


public class Interface1 implements employeeemployee,employeesalary,employeeprofile
{
    public String name()
    {
        String EmpName ="shiv";
        return EmpName;
    }
    public int salary()
    {
        int EmpSal=40000;
        return EmpSal;
    }
    public String profile()
    {
        String EmpProfile ="software tester";
        return EmpProfile;
    }
    public static void main(String[] args)
    {
        Interface1 i1 = new Interface1();
        System.out.println(i1.name());
        System.out.println(i1.salary());
        System.out.println(i1.profile());


    }

}