// A19 - WAP to declare a Global Variable.

package ab52;

public class JavaGlobalVariable 
{
	static int noofdays2025 = 365; //Global Variable

	public static void main(String[] args) 
	{
		int earningperday = 200; // local varaible
		
		int totaleraning = earningperday * noofdays2025;
		
		System.out.println("Total of Earning: " + totaleraning);

	}

}
