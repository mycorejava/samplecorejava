import java.util.Scanner;
public class DatatypeVerification {
	
	public void DataCheck()
	{
		System.out.println("Enter something:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
			System.out.print("Input is int");
		}
		else if (sc.hasNextFloat())
		{
			System.out.print("Input is float");
		}
		else if (sc.hasNextDouble())
		{
			System.out.print("Input is double");
		}
		else if (sc.hasNextLong())
		{
			System.out.print("Input is long");
		}
		else if (sc.hasNext())
		{
			String string = sc.nextLine();
			if(string.length()>1)				
				System.out.print("Input is string");
			else
				System.out.print("Input is char");
		}
		
	}

	public static void main(String[] args)
	{
		int g = 3;
		float f = 31.44f;
		int a[] = {1,2,3,4,5};
		String st[][]= {{"A1","A2","A9"},
				        {"A4","A5","A6","A7","A8"}
		               };
		
		DatatypeVerification dv = new DatatypeVerification();
		//dv.DataCheck();
		
		/*for(int i=0;i<=a.length;i++)
		{
			System.out.println("\n"+a[i]);
		}*/
		 
		for(int q=0;q<2;q++)
		{
			if(st[q][2]=="A9" || st[q][2]=="A6" )
			System.out.println(""+st[q][2]);
		}
		
//		for(int l=0;l<st.length;l++)
//		{
//			for(int m=0;m<st[l].length;m++)
//			System.out.println(st[l][m]);
//		}
	}
}
