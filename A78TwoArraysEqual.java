//A78 - WAP to check if 2 arrays are equals to each other at run time.
package ab52;

import java.util.Arrays;
import java.util.Scanner;

public class A78TwoArraysEqual
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int [] array1 = new int[s1.nextInt()];
		int [] array2 = new int[array1.length];
		
		for(int i =0; i<=array1.length-1; i++)
		{
			System.out.println("Please enter the value of array 1 at index: " +i);
			array1[i] = s1.nextInt();
			
			System.out.println("Please enter the value of array 2 at index: " +i);
			array2[i] = s1.nextInt();
		}
		System.out.println("First Array is:->" +Arrays.toString(array1));
		System.out.println("First Array is:->" +Arrays.toString(array2));
		
		boolean b1 = Arrays.equals(array1, array2);
		if(b1==true)
		{
			System.out.println("Both Array are Equals");
		}
		else
		{
			System.out.println("Both Array are NOT Equals");
		}
		s1.close();
	}
}
