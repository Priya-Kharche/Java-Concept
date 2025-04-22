package EshanJava;

import java.util.Arrays;

public class ArrEqual1 {

	public static void main(String[] args) 
	{
		String[] a = {"Ram", "Vishnu", "Bheem"};
		String[] b = {"Ram", "Vishnu45", "Bheem"};
		
		//boolean answer = Arrays.equals(a, b);
		//if(answer == true)
		if(Arrays.equals(a, b))
		{
			System.out.println("Array is equal");
		}
		else
		{
			System.out.println("Array is not equal");
		}
	}

}
