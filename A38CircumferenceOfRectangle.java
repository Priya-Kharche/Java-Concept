// A38 - WAP to print Circumference of Rectangle using Scanner Class.

package ab52;

import java.util.Scanner;

public class A38CircumferenceOfRectangle 
{

	public static void main(String[] args) 
	{
		//Circumference of Rectangle = a(a+b);
		Scanner s1 = new Scanner(System.in);
				
		// Get the Value of a from the user
		System.out.println("Please Enter the Value of a");
		double a = s1.nextDouble();
				
		System.out.println("Please Enter the Value of b");
		double b = s1.nextDouble();
				
		double CircumferenceofRectangle = a*(a+b); 
				
		System.out.println(" Circumference of Rectangle :" +CircumferenceofRectangle);
		s1.close();
		
	}

}
