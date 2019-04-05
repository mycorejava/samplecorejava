interface Vehicle
{

    // all are the abstract methods.
    int changeGear(int a);
    int speedUp(int a);
    int applyBrakes(int a);
}


public class Aeroplane implements Vehicle
{
    public int changeGear(int a)
    {

        System.out.println(a);



        return a;

    }
    public int speedUp(int a)
    {

        System.out.println(a);
        return a;

    }
    public int applyBrakes(int a)
    {

        System.out.println(a);
        return a;
    }

    public static void main(String[] args)
    {
        Aeroplane a1 =new Aeroplane();
        int gearNo = a1.changeGear(3);

        if(gearNo >=3)
        {
            System.out.println("not able to increase the speed");
        }
        else {
            a1.speedUp(78);
        }
            a1.applyBrakes(90);


    }

}
