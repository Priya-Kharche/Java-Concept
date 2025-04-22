package EshanJava;

public class ArrReverse1 {

	public static void main(String[] args) 
	{	
		char a [] = {'m','o','u','s','e'};
		char[] reverse = new char[a.length];
		
		for(int i = a.length-1 , j=0; i>=0 && j<=a.length-1; i--, j++)
		{
			reverse[j] = a[i];
		}
System.out.println(reverse);
	}

}
