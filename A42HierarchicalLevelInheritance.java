//A42 - WAP on Hierarchical Level Inheritance

package ab52;
//creating the base class(or superclass)
class Company
{
	void CompanyName()
	{
		System.out.println("Company Name is Oracle");
	}
}
//creating the subclass1 that inherits the base class
class Employee1 extends Company
{
	void EmployeeName1()
	{
		System.out.println("Employee Name 1 is Parth.");
	}
}
//creating the subclass2 that inherits the base class
class Employee2 extends Company
{
	void EmployeeName2()
	{
		System.out.println("Employee Name 2 is Nandini.");
	}
}
//creating the subclass3 that inherits the base class
class Employee3 extends Company
{
	void EmployeeName3()
	{
		System.out.println("Employee Name 3 is Kavya.");
	}
}
//Main class
public class A42HierarchicalLevelInheritance
{
	public static void main(String[] args) 
	{
		Employee1 E1 = new Employee1();
		E1.CompanyName();
		E1.EmployeeName1();
		
		Employee2 E2 = new Employee2();
		E2.CompanyName();
		E2.EmployeeName2();
		
		Employee3 E3 = new Employee3();
		E3.CompanyName();
		E3.EmployeeName3();
	}
}
