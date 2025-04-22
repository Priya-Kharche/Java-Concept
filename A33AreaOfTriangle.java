//A33 - WAP to print Area of Triangle using Scanner Class

package ab52;

import java.util.Scanner;

public class A33AreaOfTriangle {

	public static void main(String[] args) 
	{
		//Area of Triangle = 0.5*b*b;
		// Get the Value of b from the user
		System.out.println("Please Enter the Value of b");
		
		Scanner s1 = new Scanner(System.in);
		int b = s1.nextInt();
		
		double area = 0.5*b*b;
		
		System.out.println("Area of Triangle :" + area);
		s1.close();

	}

}
