package ab52;

public class LogicalOperator {

	public static void main(String[] args) 
	{
		String a = "Pizza";
		String b = "Cold-Drink";
		if(a==b && a!=b)
		{
			System.out.println("Hi, boths foods are your");
		}
		if(a==b || a!=b)
		{
			System.out.println("Only for one.");
		}
		
	}

}
