//A80 - WAP to copy one array into another array in reverse order.
package ab52;

import java.util.Arrays;

public class A80ArraysCopyPasteReverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the array:");
		
		int input[] = new int[3];
		input[0] = 74;
		input[1] = 84;
		input[2] = 94;
		int output[] = new int[input.length];
		
		for(int i=0, j=input.length-1; i<=input.length-1; i++ , j--)
		{
			output[j] = input[i];
		}
		System.out.println("Input Array is:->" +Arrays.toString(input));
		System.out.println("Output Array is:->" +Arrays.toString(output));
	}

}
