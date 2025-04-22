package EshanJava;

import java.util.Arrays;

public class ArrCount {

	public static void main(String[] args)
	{

		int count =0;
		int temp = 0;

		String input = "PR no 24";
		char [] array = input.toCharArray();
		System.out.println(Arrays.toString(array));
	
		for(int i=0; i<=7; i++)
		{
			if(Character.isAlphabetic(array[i]) == true)
			{
				count++;
			}
			
			if(Character.isDigit(array[i]) == true)
			{
				temp++;
			}
		}
		System.out.println("Count of Alphabets " +count);
		
		System.out.println("Count of Digits " +temp);
		
	}

}
