//A32 - WAP to print Circumference of Circle using Scanner Class

package ab52;

import java.util.Scanner;

public class A32CircumferenceOfCircle
{

	public static void main(String[] args)
	{
		//Circumference of Circle = 2*pi*r
		// Get the radius from the user
		System.out.println("Please Enter the value of Radius:");
		
		Scanner s1 = new Scanner(System.in);
		double r  = s1.nextDouble();
		
		// Calculate the circumference
		double circumference = 2 * Math.PI *r; 	
		
		System.out.println("Circumference of Circle: " + circumference);
		s1.close();
	}

}
