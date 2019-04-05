class Test1
{
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String empName;
    private int empId;
    private int empAge;

    // get method for age to access
    // private variable geekAge
    public int getAge()
    {
        return empAge;
    }

    // get method for name to access
    // private variable geekName
    public String getName()
    {
        return empName;
    }

    // get method for roll to access
    // private variable geekRoll
    public int getId()
    {
        return empId;
    }

    // set method for age to access
    // private variable geekage
    public void setAge( int newAge)
    {
        empAge = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        empName = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setId( int newID)
    {
        empId = newID;
    }
}
public class ExampleEncapsulate1 extends Test1
{
    public static void main (String[] args)
    {
        ExampleEncapsulate1 obj = new ExampleEncapsulate1();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setId(0001);

        // Displaying values of the variables
        System.out.println("employee name: " + obj.getName());
        System.out.println("employee age: " + obj.getAge());
        System.out.println("employee id: " + obj.getId());

        //System.out.println(obj.empName);
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);
    }
}