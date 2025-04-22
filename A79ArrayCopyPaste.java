//A79 - WAP to copy one array into another array
package ab52;

import java.util.Arrays;
import java.util.Scanner;

public class A79ArrayCopyPaste {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int [] input = new int[s1.nextInt()];
		
		for(int i =0; i<=input.length-1; i++)
		{
			System.out.println("Please enter the value of array 1 at index: " +i);
			input[i] = s1.nextInt();
		}
		System.out.println("This is your Input Array is:->" +Arrays.toString(input));
		s1.close();
		int[] output = new int[input.length];
		for(int j =input.length-1; j>=0; j--)
		{
			output[j] = input[j];
		}

		System.out.println("This is your Copied Array is:->" +Arrays.toString(output));
	}

}
