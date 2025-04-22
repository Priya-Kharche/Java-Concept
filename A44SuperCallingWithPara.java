//A44 - WAP on super calling statement using parameterized super calling statement.

package ab52;

	class Course_1
	{
		Course_1(String name, double fees )
		{
			System.out.println("Java with Selenium");
		}
	}
	
	class Course_2 extends Course_1
	{
		Course_2()
		{
			super("NIT", 25000);
			System.out.println("API");
		}
	}
	
	public class A44SuperCallingWithPara extends Course_2
	{
		A44SuperCallingWithPara()
		{
			super();
			System.out.println("Manual");
		}
	public static void main(String[] args) 
	{
		new A44SuperCallingWithPara();

	}

}
