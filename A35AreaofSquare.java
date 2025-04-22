// A35 - WAP to print Area of Square using Scanner Class
package ab52;

import java.util.Scanner;

public class A35AreaofSquare 
{

	public static void main(String[] args) 
	{
		//Area of Square = a*a;
		// Get the value of a from the user
		System.out.println("Please Enter the Value of a");
		
		Scanner s1 = new Scanner(System.in);
		double a = s1.nextDouble();
		
		double area = a*a;
		
		System.out.println("Area of Square: " + area);
		s1.close();

	}

}
