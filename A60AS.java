//A60 - WAP on Access specifiers within package for Class.

package ab52;

abstract class PetrolBike
{
		abstract void BikePrice(); // abstract methods without implementation

		public void BikeDetails() // Concrete method with implementation 
		{
			System.out.println("Manufacturer & Model is : Royal Enfield");
		}
}

public class A60AS extends PetrolBike
{
	public static void main(String[] args) 
	{
		

	}

	@Override
	void BikePrice() 
	{
		System.out.println("Royal Enfield Price: 300000");
		
	}

}
