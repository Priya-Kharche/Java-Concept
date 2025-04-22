//A15-WAP with combination of 3 static parameterized methods and try calling all of them
package ab52;

public class CallingStaticParaMethods
{
	static void stuname(String name, char gender)
	{
		System.out.println(name);
		System.out.println(gender);
	}
	
	static void CourseName(int BatchNo, String coname, double fees)
	{
		System.out.println(BatchNo);
		System.out.println(coname);
		System.out.println(fees);
	}
	
	static void TeacherDetails(String name, boolean b)
	{
		System.out.println(name);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		
		stuname("Priya", 'F');
		CourseName(52, "Java with Selenium", 25000);
		TeacherDetails("Manish Sir", true);
		
	}

}
