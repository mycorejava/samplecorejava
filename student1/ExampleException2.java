//custom exception

class InvalidAgeException extends Exception
{
    public InvalidAgeException()
    {
        System.out.println("invalid age");
    }
}

public class ExampleException2
{
    void ageCheck(int age) throws InvalidAgeException
    {
        if(age>110)
        {
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("no exception");
        }
    }

    public static void main(String args[])
    {
        ExampleException2 c = new ExampleException2();
        try
        {
            c.ageCheck(160);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

        }
    }
}