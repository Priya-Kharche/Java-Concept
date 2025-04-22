//A84 - WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String            
package ab52;

import java.util.Arrays;

public class A84CountAlphabets 
{
	static int countofalpha = 0; 
	static int countofnumeric = 0; 
	static int countofspace = 0; 
	
	public static void main(String[] args) 
	{
		String input = "k v no 2";
		char [] array = input.toCharArray();
		System.out.println("Input Array is :-> " +Arrays.toString(array));
		
		for(int i=0; i<=array.length-1; i++)
		{
			boolean b1 = Character.isAlphabetic(array[i]);
			if(b1!=true)
			{
				countofalpha++;
			}
			
			boolean b2 = Character.isDigit(array[i]);
			if(b2==true)
			{
				countofnumeric++;
			}
			
			boolean b3 = Character.isWhitespace(array[i]);
			if(b3==true)
			{
				countofspace++;
			}
		}
		System.out.println("Count of aplhabets in the given array: "+countofalpha);
		System.out.println("Count of numbers in the given array: "+countofnumeric);
		System.out.println("Count of space in the given array: "+countofspace);
		
		int countofspecialcharacter = input.length()-(countofalpha+countofnumeric+countofspace);
		
		System.out.println("Count of special characters in the given array: "+countofspecialcharacter);
	}

}
