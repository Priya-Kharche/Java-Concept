//A41 - WAP on Multi Level Inheritance.

package ab52;

class PThree_3  //Parent class
{
	void PThreeMethod()
	{
		System.out.println("PThree methods called.");
	}
}

class PTwo_2 extends PThree_3  // // Child class inheriting from PThree_2
{
	void PTwoMethod()
	{
		System.out.println("PTwo methods called.");
	}
}

public class A41MultiLevelInheritanceC extends PTwo_2 //Sub-child class inheriting from PTwo_2
{
	void COneMethod()
	{
		System.out.println("COne methods called.");
	}
	public static void main(String[] args) 
	{
		A41MultiLevelInheritanceC c1 = new A41MultiLevelInheritanceC();
		c1.PTwoMethod();  // Inherited from PTwoMethod
		c1.COneMethod();  // Inherited from COneMethod
		c1.PThreeMethod();  // Inherited from PThreeMethod

	}

}
