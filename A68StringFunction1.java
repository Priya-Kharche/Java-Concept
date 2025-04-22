//A68 - Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
package ab52;

public class A68StringFunction1 
{
	public static void main(String[] args) 
	{
		String input = "priya";
		System.out.println(input.toUpperCase());
		
		String input1 = "PRIYA";
		System.out.println(input1.toLowerCase());
		
		String input2 = "Priya";
		int size = input2.length(); // check length
		System.out.println("Length of the input: " +size);
		
		String input3 = "Priya";
		char output = input3.charAt(3); // check char
		System.out.println("Char value: " +output);
		
		String input4 = "   I am a Priya  ";
		String output1 = input4.trim(); // check trim
		System.out.println("Trim function: " +output1);
}
}
