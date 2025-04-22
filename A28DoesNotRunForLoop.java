//A28 - WAP to run a for loop that does not start.

package ab52;

public class A28DoesNotRunForLoop 
{
	public static void main(String[] args) 
	{
		for(int i=10; i<0; i++)
		{
			System.out.println("Not Printed");
		}
    System.out.println("For Loop does not start");
	}

}
