// A76 - Find out the average of all the numbers present in your array.
package ab52;

import java.util.Scanner;

public class A76AvgArray {

	public static void main(String[] args) 
	{
		double sum = 0;
		double average;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		double [] array = new double[s1.nextInt()];
		for(int i =0; i<=array.length-1; i++)
		{
			System.out.println("Please enter the value of array 1 at index: " +i);
			array[i] = s1.nextDouble();
			sum = sum + array[i];
		}
		System.out.println("The sum of values in your array->" +sum);
		average = sum/array.length;
		System.out.println("Average of the array is ->" +average);
		s1.close();
	}

}
