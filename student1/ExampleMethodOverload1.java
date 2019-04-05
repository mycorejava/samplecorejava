public class ExampleMethodOverload1
{
    // Overloaded method
    public Integer sum (Integer a, String b) throws Exception{
        return 0;
    }

    // Overloading method
    public Integer sum (Integer a, Integer b) throws Exception{
        return -5;
    }

   void getempdetails(String name)
   {
       System.out.println(name);
   }
    void getempdetails(int id)
    {
        System.out.println(id);
    }
    void getempdetails(String name,int id)
    {

        System.out.println(name+id);
    }

    public static void main(String[] args) {
        ExampleMethodOverload1 eee = new ExampleMethodOverload1();
        eee.getempdetails(45);
        eee.getempdetails("shiv");
        eee.getempdetails("shiv",45);
    }
}
