
public class StringReplace {
	

	public void StringReplaceFunc(String str)
	{
		String postreplacestring = str.replaceFirst("l", "k");
		System.out.println("The string after replacement is " +postreplacestring);
		return;
	}
	public static void main(String[] args)
	{  
		StringReplace sr = new StringReplace();
		sr.StringReplaceFunc("HelloWorld");
	}

}
