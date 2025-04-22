// A46 - WAP on method overriding.

package ab52;

class FB //Creating a parent class.  
{
	void Login ()   //defining a method      
	{
		System.out.println("Login with Email ID...");
	}
}

public class A46MethodOverriding extends FB
{
	void Login ()   //defining a method      
	{
		System.out.println("Login with Mobile No..."); 
	}

	public static void main(String[] args) 
	{

		A46MethodOverriding obj = new A46MethodOverriding();
		obj.Login();
	}

}
