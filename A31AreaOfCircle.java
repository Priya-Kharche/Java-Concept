//A31 - WAP to print Area of Circle using Scanner Class

package ab52;

import java.util.Scanner;

public class A31AreaOfCircle 
{
	public static void main(String[] args) 
	{
	//pi*r*r;
	// Get the radius from the user
	System.out.println("Please Enter the Value of Radius");
	
	Scanner s1 = new Scanner(System.in);
	int r = s1.nextInt();
	
	double area = Math.PI*r*r;
	
	System.out.println("Area of Circle: " + area);
	s1.close();
	
	}

}
