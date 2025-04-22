package EshanJava;

public class ArrWhitespace 
{

	public static void main(String[] args) 
	{
		boolean s2 = false;
		String str= "Idea234  123";
		char[] s1	= str.toCharArray();
		for(int i = 0; i <=str.length(); i++)
		{
			s2 = Character.isWhitespace(s1[i]);
			
			if(s2==true)
			{
				System.out.println("WhiteSpace");
			}
		}


	}

}
