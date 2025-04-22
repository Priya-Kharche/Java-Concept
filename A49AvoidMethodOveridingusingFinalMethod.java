//A49 - WAP to avoid Method Overiding using Final Method.

package ab52;

class PreCondition
{
	final void Login()
{
	System.out.println("Login using Email ID");
}
}
public class A49AvoidMethodOveridingusingFinalMethod extends PreCondition 
{
	void LoginWithUName()
    {
	System.out.println("Login using User Name");
    } 
	
	void LoginWithMob()
	{
		System.out.println("Login using Mobile Number");
	}
	
	public static void main(String[] args) 
	{

		A49AvoidMethodOveridingusingFinalMethod m1 = new A49AvoidMethodOveridingusingFinalMethod();
		m1.Login();
	}
}

