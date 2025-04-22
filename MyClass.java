// A20 - WAP on Constructor Overloading. 

package ab52;

public class MyClass
{
	MyClass()// NonParameterized Constructor 
	{
		System.out.println("Constructor 1 - Non Parameterized");
	}
	
	MyClass(int a) // Parameterized Constructor 
	{
		System.out.println("Constructor 2 - " + a);
	}
	
	MyClass(int a, String b)  // Parameterized Constructor
	{
		System.out.println("Constructor 3 - " + a + ", " + b);
	}
	
	MyClass(String a,int b)  // Parameterized Constructor
	{
		System.out.println("Constructor 4 - " + a + ", " + b);
	}

	public static void main(String[] args)
	{
		new MyClass(); // Call Constructor 1
		new MyClass(10); // Call Constructor 2
		new MyClass(15, "Hello"); // Call Constructor 3
		new MyClass("Java", 20); // // Call Constructor 4
	}

}
