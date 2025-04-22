// A22 - WAP for static and non static global variables and utilize them in both static and non static method

package ab52;

public class A22CallGlobalVariable 
{
	
	 static int a = 50;  // Declaring and initializing static global variable
	 
	 static int b = 20;  // Declaring and initializing static global variable
	 
	 int c = 10; // Declaring and initializing non static global variable
	 int d = 10; // Declaring and initializing non static global variable

	static void add() //static method
	{
		int sum = a+b;
		System.out.println("Addition is:" + sum);
	}
	
	static void sub() //static method
	{
		int subtract = a-b;
		System.out.println("Subtraction is: " + subtract);
	}

	void mul() // non-static method
	{
		int multiply = c*d;
		System.out.println("Multiplication is: " +multiply);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		
		A22CallGlobalVariable obj = new A22CallGlobalVariable();
		obj.mul();
		
	}

}
