public class Car
{
    public static void main(String args[])
    {
        Vehicle hundaii20 = new Vehicle();
        hundaii20.setSpeed(70);
        hundaii20.noOfTyres = 4;
        int carSpeed = hundaii20.currentSpeed();
        System.out.println("Car speed is: " + carSpeed);
        display();
    }

    static void display()
    {
        System.out.println("Checking return type");
        return;

    }
}
