package EshanJava;

public class ArrSplitString
{
	public static void main(String[] args) 
	{
		String str = "India, is my country";
		
		String [] a = str.split("India");
		
		System.out.println(a[1]);
		
		String str1 = "Hello &worldMyIndia";
		
		String [] b	= str1.split("My");
	
		System.out.println(b[1]);
	}

}
