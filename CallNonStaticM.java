package ab52;

public class CallNonStaticM 
{
	void batchinfo()
	{
		System.out.println("Automation Batch 52");
	}
	public static void main(String[] args) 
	{
		
		CallNonStaticM obj = new CallNonStaticM();
		obj.batchinfo();
	}

}
