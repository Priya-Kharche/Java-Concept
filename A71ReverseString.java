//A71 - WAP to reverse a string.
package ab52;

public class A71ReverseString 
{
	public static void main(String[] args) 
	{
		String input = "mouse";
		
		String output = " ";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			char a1 = input.charAt(i);
			
			output = output + a1;
			
			System.out.println(output);
			
		}
	}

}
