package EshanJava;

import java.util.Arrays;

public class ArrayString {

	public static void main(String[] args)
	{
		String [] name = new String[3];
		name[0] = "Deb";
		name[1] = "Peb";
		name[2] = "Jeb";
		
		for(int i=0; i<=2; i++)
		{
			System.out.println(name[0]);
			System.out.println(name[1]);
		}
		
		System.out.println(Arrays.toString(name));
		
	}
		
	}

}
