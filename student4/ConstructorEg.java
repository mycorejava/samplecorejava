
public class ConstructorEg {

	String str;

	ConstructorEg()
	{
		this("String",7);
		//ConstructorEg(5);
		System.out.println("Calling the non parametrized constructor");
	}

	ConstructorEg(int p1)
	{
		System.out.println("Calling the single parametrized constructor");
	}
	
	ConstructorEg(String str,int p1)
	{
		this.str = str;
		//this(5);
		System.out.println("Calling the double parametrized constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ConstructorEg ce0 = new ConstructorEg();
	ConstructorEg ce1 = new ConstructorEg(45);
	ConstructorEg ce2 = new ConstructorEg("String",89);

	}

}
