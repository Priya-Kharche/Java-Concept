package EshanJava;

public class ArrSumAvg {

	public static void main(String[] args) 
	{
		int [] no = {10,20, 30, 40, 50, 60};
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<=no.length-1; i++)
		{
			sum = sum+no[i];
		}
		System.out.println("Sum is " + sum);
		avg = sum/no.length;
		
		System.out.println("Avg is " + avg);
	}

}
