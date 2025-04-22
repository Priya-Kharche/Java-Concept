//A63 - WAP on Exception handling using nested try catch keywords.
package ab52;

public class A63ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 1/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println("Handle the Exeception");
		}
	}

}
