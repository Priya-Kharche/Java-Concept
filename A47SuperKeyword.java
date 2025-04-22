//A47 - WAP on Super Keyword...

package ab52;

class FaceBook //Creating a parent class.  
{
	void Login ()   //defining a method      
	{
		System.out.println("Login with Email ID...");
	}
}

public class A47SuperKeyword extends FaceBook
{
	void Login()   //defining a method  
	{
		super.Login();
		System.out.println("Login with Mobile No..."); 
	}

	public static void main(String[] args) 
	{
		A47SuperKeyword obj1 = new A47SuperKeyword();
		obj1.Login();
	}

}
