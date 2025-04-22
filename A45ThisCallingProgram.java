//A45 - WAP on this calling statement

package ab52;

public class A45ThisCallingProgram 
{
	A45ThisCallingProgram(int a)
	{
		this(45, 9.8);
		System.out.println("This calling is 1.");
	}

	A45ThisCallingProgram(int a, double b)
	{
		System.out.println("This calling is 2.");
	}
	
	A45ThisCallingProgram()
	{
		this(100);
		System.out.println("This calling is 3 ");
	}
	
	public static void main(String[] args) 
	{
		//new A45ThisCallingProgram(10, 4.5);
		new A45ThisCallingProgram ();
	}

}
