//A52 - WAP on Interface with 2 Abstract methods

package ab52;

interface Credential  // Define interface 
{
	void username(); // Abstract method (without implementation)
	
	void password(); // Abstract method (without implementation)
}
public class A52InterfacewithAbstractMethods implements Credential
{

	public static void main(String[] args)
	{
		A52InterfacewithAbstractMethods A52 = new A52InterfacewithAbstractMethods();
		A52.username();
		A52.password();
	}

	//Implement the abstract method from the parent class
	@Override
	public void username() 
	{
		System.out.println("Software.Tester");
		
	}

	//Implement the abstract method from the parent class
	@Override
	public void password() 
	{
		System.out.println("mkt@123");
	}

}
