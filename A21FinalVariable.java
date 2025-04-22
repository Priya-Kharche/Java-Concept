// A21 - WAP on Final Variable.
package ab52;

public class A21FinalVariable 
{
	 static final int a = 50;  // Declaring and initializing a final variable
	 
	 static final int b = 20;  // Declaring and initializing a final variable

	static void add()
	{
		int sum = a+b;
		System.out.println("Addition is:" + sum);
	}
	
	static void sub() 
	{
		int subtract = a-b;
		System.out.println("Subtraction is: " + subtract);
	}
	
	public static void main(String[] args) 
	{
	add();
	sub();
	}

}
