package EshanJava;

import java.util.Arrays;

public class ArrMinMax {

	public static void main(String[] args) 
	{	
		int [] a = {10, 20, 30, 40};
		int min = 0;
		int max = 0;
		
		/*for(int i = 0; i<=a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}	
		if(a[i] > max)	
		{
			max = a[i];
		}
		}		
System.out.println(min);
System.out.println(max);*/
		
		Arrays.sort(a);
		min = a[0];
		max = a[a.length-1];
		System.out.println(min);
		System.out.println(max);
		

		
		
}

}
