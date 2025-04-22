// A36 - WAP to print Circumference of Square using Scanner Class

package ab52;

import java.util.Scanner;

public class A36CircumferenceOfSquare 
{

	public static void main(String[] args) 
	{
		//Circumference of Square = 4a;
		// Get the value of a from the user
		System.out.println("Please Enter the Value of a");
		
		Scanner s1 = new Scanner(System.in);
		double a = s1.nextDouble();
		
		double CircumferenceofSquare = 4*a;
		
		System.out.println("Circumference of Square " + CircumferenceofSquare);
		s1.close();

		
	}

}
