 //A50 - WAP on Abstract Class and Abstract Method

package ab52;
	
abstract class Authentication // abstract class
{
	abstract void Login(); // Abstract method (without implementation)
}

//Create a concrete class that extends the abstract class
public class A50AbstractClsAbstractMthd extends Authentication
{
	// Main class to demonstrate the abstract class
	public static void main(String[] args) 
	{
		A50AbstractClsAbstractMthd obj = new A50AbstractClsAbstractMthd();
		obj.Login();

	}
	// Implement the abstract method from the parent class
	@Override
	void Login() 
	{
		System.out.println("Login with OTP");
	}
}
