// A40 - WAP on Single Level Inheritance.

package ab52;

class ParentClass1
{
	static void ParentMethod()
	{
		System.out.println("Hello, Parent Class methods.");
	}
}
public class A40SingleLevelInheritanceChild extends ParentClass1
{
	static void ChildMethod()
	{
		System.out.println("Hi, Child Class mehtods");
	}
	
	public static void main(String[] args) 
	{
		ParentMethod();
		ChildMethod();

	}
}
