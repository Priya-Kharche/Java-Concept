//A77 - WAP to pass anything at Runtime using args variable in the main method.
package ab52;

import java.util.Arrays;
import java.util.Scanner;

public class A77PassRunTimeArgsArray {

	public static void main(String[] args) 
	{
       int rollno[] = new int[5];
		
		System.out.println("Please enter a number:");
		Scanner s1 = new Scanner(System.in);
		rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		rollno[3]=s1.nextInt();
		rollno[4]=s1.nextInt();
		
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}
}
