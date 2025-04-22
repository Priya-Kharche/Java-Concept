// A18 - WAP to declare a variable inside a static and non static  Method. For local varable.

package ab52;

public class JavaLocalVariables 
{
	static void add() // Static add method
	{
		int a = 10; // static local variable
		int b = 20; // static local variable
		System.out.println("Addition is:" +(a+b));
	}
	
	void sub() // Non-Static sub method
	{
		int a = 100;
		int b = 200;
		System.out.println("Subtraction is: " +(b-a));
	}
	public static void main(String[] args) 
	{
		add();
		JavaLocalVariables jv = new JavaLocalVariables();
		jv.sub();
		
	}

}
