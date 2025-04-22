// A51 - WAP on Abstract Class with both Abstract and Concrete methods.
package ab52;

abstract class Vehilce // define abstract class
{
	abstract void VehicleRun(); // Abstract method (without implementation)

	// Concrete method (with implementation)
	void car()
	{
	 System.out.println("This is car...");
	}
}

//Create a concrete class that extends the abstract class
public class A51AbstractClassbothCmAm extends Vehilce
{
	
	// Main class to demonstrate the abstract class and its subclasses
	public static void main(String[] args) 
	{
		// Create an instance of the A51AbstractClassbothCmAm class
		A51AbstractClassbothCmAm A51 = new A51AbstractClassbothCmAm();
		
		// Call the concrete method
		A51.car();
		
		 // Call the abstract method (which is implemented in the subclass)
		A51.VehicleRun();
	}

	//Implement the abstract method from the parent class
	@Override
	void VehicleRun() 
	{
		System.out.println("Vehicle is Running...");
		
	}
}



