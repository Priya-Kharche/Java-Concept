// A23 - WAP to update static and non static global variable.
package ab52;

public class A23UpdateGlobalVariable 
{
	int noofdays2025 = 365; // Declaring and initializing static global variable.
	
	public static void main(String[] args) 
	{
		int earningperday = 200; 
		
		earningperday = 210;  //updating the value of a local variable.
		
		A23UpdateGlobalVariable obj = new A23UpdateGlobalVariable();
		
		int totalearning = earningperday*obj.noofdays2025;
		
		System.out.println(totalearning);
		
		obj.noofdays2025 = 366; // updating the value of global variable in case of non static variable
		
		int totalearning1 = earningperday*obj.noofdays2025;
		
		System.out.println(totalearning1);
		

	}

}
