package EshanJava;

public class ArrNochked {

	public static void main(String[] args) 
	{
		int [] no = new int[5];
		no[0] = 21 ;
		no[1] = 23;
		no[2] = 98;
		no[3] = 76;
		no[4] = 765;
		
	int notobechecked = 23;
	
	for(int i = 0; i<=no.length-1; i++)
	{
		if(notobechecked == no[i])
		{
			System.out.println("This number is present index" +notobechecked);
		}
		if(no.length ==i+1)
		{
			System.out.println("Sorry we are not able to find the number");
		}
	}
	
	
	}

}
