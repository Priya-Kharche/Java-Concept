// A82 - WAP on arrayindexoutofbounds expection with a try catch.
package ab52;

public class A82ArrayOutofBoundException 
{

	public static void main(String[] args) 
	{
	    // taking array of integers
        int a[] = { 1, 2, 3, 4, 5};
        // using try catch block
        try {
            for (int i = 0; i <= a.length; i++)
                System.out.print(a[i] + " ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nException Caught");
        }
	}
}

