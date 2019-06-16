
public class If_Else {
	public static void main(String[] args)
	{
	int a = 25;
	a++;
	if(a++ == 25)
	{
		System.out.println("A is 25");
	}
	else if(a++ < 25)
	{
		System.out.println("A is LT 25");
	}
	else if(a++ > 25)
		System.out.println("Value of a is"+a);
	}

}
