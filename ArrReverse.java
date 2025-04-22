package EshanJava;

import java.util.Arrays;

public class ArrReverse 
{

	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5};
		int [] reverse = new int[a.length];
		
		for(int i=a.length-1, j=0; i>=0 && j<=a.length-1; i--, j++)
		{
			reverse[j] = a[i];
		}
		System.out.println(Arrays.toString(reverse));
	}

}
