package EshanJava;

import java.util.Arrays;

public class ArrEqual {

	public static void main(String[] args)
	{
		int [] a = {89,11};
		int [] b = {89,11};
		
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
