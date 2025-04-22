//A34 - WAP to print Circumference of Triangle using Scanner Class

package ab52;

import java.util.Scanner;

public class A34CircumferenceOfTriangle 
{
	public static void main(String[] args) 
	{
		//Circumference of Triangle = a+b+c;
		
		Scanner s1 = new Scanner(System.in);
		
		// Get the Value of a from the user
		System.out.println("Please Enter the Value of a");
		double a = s1.nextDouble();
		
		System.out.println("Please Enter the Value of b");
		double b = s1.nextDouble();
		
		System.out.println("Please Enter the Value of c");
		double c = s1.nextDouble();
		
		double CircumferenceofTriangle = a+b+c;
		
		System.out.println("Circumference of Triangle :" +CircumferenceofTriangle);
		s1.close();
		}

}
