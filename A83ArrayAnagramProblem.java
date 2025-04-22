//A83- WAP to find out if the given 2 strings are anagram
package ab52;

import java.util.Arrays;

public class A83ArrayAnagramProblem 
{

	public static void main(String[] args) 
	{
		String a ="ear"; //[a,e,r]
		
		String b = "are"; //[a,e,r]
		
		if(a.length()!=b.length())
		{
			System.out.println("Ther are NOT ANAGRAM");
		}
		else
		{
		System.out.println("OK, The length of 2 strings are same.");
		
		char c1[] = a.toCharArray();
		
		char c2[] = b.toCharArray();
		
		System.out.println("Before Sorting c1 ->" +Arrays.toString(c1));
		System.out.println("Before Sorting c2 ->" +Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("After Sorting c1 ->" +Arrays.toString(c1));
		System.out.println("After Sorting c2 ->" +Arrays.toString(c2));
		
		boolean b1 = Arrays.equals(c1, c2);
		System.out.println(b1);
	}
		
	}
}
