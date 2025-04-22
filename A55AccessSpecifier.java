//A55 - WAP on Access specifiers within class for methods
package ab52;

public class A55AccessSpecifier 
{
	public static void publicmethod()
	{
		System.out.println("This is Public Method");
	}
	
	private static void pvtmethod()
	{
		System.out.println("This is Private Method");
	}
	
	protected static void protectedmethod()
	{
		System.out.println("This is Protected Method");
	}
	
	static void defaultmethod()
	{
		System.out.println("This is Default Method");
	}
	
	public static void main(String[] args)
	{
		publicmethod();
		pvtmethod();
		protectedmethod();
		defaultmethod();
		
	}

}
