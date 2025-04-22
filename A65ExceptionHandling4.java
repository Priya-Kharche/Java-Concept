//A65 - WAP on finally keyword concept 
package ab52;
public class A65ExceptionHandling4 
{
	public static void main(String[] args) 
	{
		try 
		{ 
            System.out.println("inside try block"); 
         // Not throw any exception 
            System.out.println(20 / 2); 
        } 
        
        // Not execute in this case 
        catch (ArithmeticException e1) 
		{ 
            System.out.println("Arithmetic Exception"); 
           
        } 
        // Always execute 
        finally 
        {
            System.out.println( 
                "finally : i execute always."); 
        }
}
}
