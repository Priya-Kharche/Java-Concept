// A37- WAP to print Area of Rectangle using Scanner Class

package ab52;

import java.util.Scanner;

public class A37AreaOfRectangle 
{
   
	public static void main(String[] args) 
	{
		//Area of Rectangle = a*b;
		Scanner s1 = new Scanner(System.in);
		
		// Get the Value of a from the user
		System.out.println("Please Enter the Value of a");
		double a = s1.nextDouble();
		
		System.out.println("Please Enter the Value of b");
		double b = s1.nextDouble();
		
		double AreaofRectangle = a*b; 
		
		System.out.println(" Area of Rectangle :" +AreaofRectangle);
		s1.close();
	}
}
