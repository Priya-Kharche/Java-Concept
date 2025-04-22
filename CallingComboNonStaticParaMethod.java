//WAP with combination of 4 non static parameterized methods and try calling all of them.
package ab52;

public class CallingComboNonStaticParaMethod 
{

	void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition of: " +c);
	}
	
	void instructor(String name, char gender, double sal)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(sal);
	}
	
	void method1(boolean a)
	{
		System.out.println(a);
	}
	
	void sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Subtraction of: " +c);
	}
	
	public static void main(String[] args) 
	{
		
		CallingComboNonStaticParaMethod np1 = new CallingComboNonStaticParaMethod();
		np1.add(50,40);
		np1.instructor("Manish", 'M', 100000);
		np1.method1(true);
		np1.sub(100, 50);

	}

}
