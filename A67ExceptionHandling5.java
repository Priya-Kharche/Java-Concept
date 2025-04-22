//A67 - WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario
package ab52;
import java.util.InputMismatchException;
import java.util.Scanner;
public class A67ExceptionHandling5 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		try
		{
			int[] rollno = new int[s1.nextInt()];
			rollno[0]=10;
			rollno[1]=20;
			rollno[2]=30;
		}
		catch(NegativeArraySizeException e1)
		{
			System.out.println("Size cannot be negative.");
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the size of an Arrayand it must be positive:");
			int[] rollno = new int[s2.nextInt()];
			rollno[0]=10;
			rollno[1]=20;
			rollno[2]=30;
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Size should be a number.");
			Scanner s3 = new Scanner(System.in);
			System.out.println("Enter the size of an Arrayand it must be positive:");
			int[] rollno = new int[s3.nextInt()];
			rollno[0]=10;
			rollno[1]=20;
			rollno[2]=30;
		}	

	}

}
