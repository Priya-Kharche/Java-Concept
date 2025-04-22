// A16 - WAP for Method overloading for static and non static method.

package ab52;

public class MethodOverloadingStatNonstatMethod 
{ 
	// Static method overloaded with different number of parameters
	static void Teaching()
	{
		System.out.println("Manual Testing");
	}
	
	static void Teaching(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static void Teaching(int a, double b, String c)
	{
		System.out.println(a+b+c);
	}
	
	// Non-static method overloaded with different parameter types
	void Teaching1(double p, double q)
	{
		System.out.println(p+q+5);
	}
	
	
	void Teaching1(String s, double d)
	{
		System.out.println(s);
		System.out.println(d);
	}
	

	public static void main(String[] args) 
	{
		// Calling static overloaded methods 
		Teaching();
		Teaching(10, 20);
		Teaching(10, 16.5, "Java" );
		
		// Calling non-static overloaded methods
		MethodOverloadingStatNonstatMethod  t1 = new MethodOverloadingStatNonstatMethod ();
		t1.Teaching1(20, 20);
		t1.Teaching1("Selenium", 12);

	}

}
