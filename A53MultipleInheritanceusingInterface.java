// A53 - WAP on Multiple -Level Inheritance using Interface Concept.

package ab52;

interface Car
{
	void CarDetail(); // Abstract method (without implementation)
	
	void CarPrice(); // Abstract method (without implementation)
}

interface Bike
{
	void BikeDetail(); // Abstract method (without implementation)
	
	void BikePrice(); // Abstract method (without implementation)
}

public class A53MultipleInheritanceusingInterface implements Car, Bike
{

	public static void main(String[] args) 
	{
		A53MultipleInheritanceusingInterface A53 = new A53MultipleInheritanceusingInterface();
		
		A53.BikeDetail();
		A53.BikePrice();
		
		A53.CarDetail();
		A53.CarPrice();

	}

	//Implement the abstract method from the parent class
	@Override
	public void BikeDetail() 
	{
		
		System.out.println("Manufacturer & Model Name: Honda - Activa 3G");
	}
	
	//Implement the abstract method from the parent class
	@Override
	public void BikePrice() 
	{
		System.out.println("Honda Activa 3G Price is 150000");
	}

	//Implement the abstract method from the parent class
	@Override
	public void CarDetail() 
	{
		System.out.println("Manufacturer & Model Name: Tata Motor - Tata Punch");
		
	}

	//Implement the abstract method from the parent class
	@Override
	public void CarPrice() 
	{
		System.out.println("Tata Motor - Tata Punch Price is 1000000");
	}
	
}
