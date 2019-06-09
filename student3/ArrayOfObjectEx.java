public class ArrayOfObjectEx
{
    public static void main(StringEx args[])
    {
       /* Person p = new Person(30, "Reena");
        Person p1 = new Person(50, "Smita");
        Person[] arrayPerson = {p, p1};

        for(Person per : arrayPerson)
        {
            System.out.println(per.id);
            System.out.println(per.name);

        } */

        Person[] personArr = new Person[3];
        for(int i=0; i<personArr.length; i++)
        {
            personArr[i] = new Person();
        }

        personArr[0].setData(25, "Ratan");
        personArr[1].setData(30, "Riya");
        personArr[2].setData(35, "Maya");

        for (Person p : personArr)
        {
            System.out.println("Age: " + p.getAge()+ "   Name: " + p.getName() + "\n");
        }
    }
}
