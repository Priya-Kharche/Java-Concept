//A70 - WAP on String Function using equals and equalsIgnoreCase concept
package ab52;

public class A70StringFunction3
{
	public static void main(String[] args) 
	{
		//equal string functions
		String name1 = "priya";
		String name2 = "Priya";
		boolean b1 = name1.equals(name2);
		System.out.println("Equal String Function:" +b1);
		
		//equalIgnoreCase 
		String name3 = "Priya";
		String name4 = "priya";
		boolean b2 = name3.equalsIgnoreCase(name4);
		System.out.println("EqualIgnoreCase String Function:" +b2);
	}

}
