public class Main
{
    public int calculateSalary( String name, int baseSalary)
    {
        System.out.println("String  Int");
        return 0;
    }

    public String calculateSalary(String name, String deptName)
    {
        System.out.println("String  String");
        return "";
    }

    public boolean calculateSalary(int baseSalary, String deptName, String name)
    {
        System.out.println("Int  String String");
        return true;
    }


    public static void main(String[] args)
    {
        Main m = new Main();
        //ICICI ic = new ICICI();
        //Bank bank = new ICICI();
        //Bank bank1 = new SBI();
        //bank1.getRateOfInterest();
        //bank.getRateOfInterest();

        m.calculateSalary("IT", 3000);
        m.calculateSalary(3000, "IT", "Rahul");
        m.calculateSalary("IT", "Neha");
    }
}
