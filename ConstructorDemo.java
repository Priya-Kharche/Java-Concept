package ab52;

public class ConstructorDemo 
{
	ConstructorDemo()
	{
		System.out.println("Hello Constructor1");
	}
	
	ConstructorDemo(String username, String pwd)
	{
		System.out.println("Hello Constructor2");
	}
	
	ConstructorDemo(int age, char c)
	{
		System.out.println("Hello Constructor3");
	}

	public static void main(String[] args)
	{
		//ConstructorDemo c1 = new ConstructorDemo();
		new ConstructorDemo();
		new ConstructorDemo("Priya", "Priya@123");
		new ConstructorDemo(30, 'f');

	}

}
