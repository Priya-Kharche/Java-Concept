package ab52;

public class MethodOverloadingDemo 
{
	public void FacbookLogin(String email)
	{
		System.out.println("Email Success");
	}
	
	public void FacebookLogin(long mobnum)
	{
		System.out.println("Mobile Number Success");
	}

	public static void main(String[] args) 
	{
		MethodOverloadingDemo d1  = new MethodOverloadingDemo();
		d1.FacbookLogin("Pk@gmail.com");
		d1.FacebookLogin(11111);

	}

}
