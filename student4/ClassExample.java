
public class ClassExample {
	int value;
	float addfloat()
	{
		return 9.5f;
	}
	int add()
	{
		float f ;
		f = addfloat();
		System.out.println(f);
		return 7;
	}
	
	
	public static void main(String[] args)
	{
		
		ClassExample ce = new ClassExample();
		int a = ce.add();
		System.out.println(a);
		
		ClassExample[] ce1 = new ClassExample[5];
		ce1[1].value=1;
		
		
	}

}
