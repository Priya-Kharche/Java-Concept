//WAP with combination of static and non static methods and try calling both of them.
package ab52;

public class CallingComboOfStaticNonStaticMethods 
{
	public void api() //Create Non-static method.
	{
		System.out.println("API Testing");
	}
	
	public static void auto() //Create Static method.
	{
		System.out.println("Automation Testing");
	}
	
	public static void main(String[] args) 
	{
		//create a object and call non-static method
		CallingComboOfStaticNonStaticMethods obj = new CallingComboOfStaticNonStaticMethods();
		obj.api();
		
		//call static method.
		auto();
	}

}
