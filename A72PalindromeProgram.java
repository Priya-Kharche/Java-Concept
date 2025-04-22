//A72 - WAP to check if the given string is a Palindrome?
package ab52;

public class A72PalindromeProgram {

	public static void main(String[] args) 
	{
	String input = "radar";
	String output = "";
	for(int i=input.length()-1; i>=0; i--)
	{
		char a1 = input.charAt(i);
		
		output = output + a1;
	}
	System.out.println("The output of the given input is: " +output);
	
	if(input.equals(output))
	{
		System.out.println("The input string is a Palindrome");
	}
	else 
	{
		System.out.println("The input string is NOT a Palindrome");
	}
	}
}
