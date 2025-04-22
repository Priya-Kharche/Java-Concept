package EshanJava;

import java.util.Arrays;

public class ArrAnagram
{

	public static void main(String[] args) 
	{
		String a = "below";
		String b = "elbow";
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		System.out.println(Arrays.toString(a1)); // [b, e, l, o, w]
		System.out.println(Arrays.toString(b1)); // [b, e, l, o, w]
		
		if(Arrays.equals(a1, b1)== true)
		{	
			System.out.println("They are Anagram");
		}
		else
		{
			System.out.println("They are not Anagram");
		
		}
	}

}
