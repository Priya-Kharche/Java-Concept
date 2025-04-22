 // A17 - WAP on Constructor call to them. 

package ab52;

public class CallConstructor 
{
	CallConstructor() // This is Constructor
	{
		System.out.println("This is Non-Parameterized Constructor");
	}
	
	CallConstructor(String uname, String pwd)
	{
		System.out.println("This is a Parameterized Constructor 1");
	}
	
	CallConstructor(int age, char gender)
	{
		System.out.println("This is a Parameterized Constructor 2");
	}

	public static void main(String[] args) 
	{
		new CallConstructor();
		new CallConstructor("Priya@gamil.com", "Priya@123");
		new CallConstructor(28, 'F');
	}
}
