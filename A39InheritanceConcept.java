// A39 - WAP on Inheritance Concept.

package ab52;
class ParentClass
{
	static void ParentMethod()
	{
		System.out.println("Parent class Called.");
	}
}

public class A39InheritanceConcept extends ParentClass
{
	static void ChildMethod()
	{
		System.out.println("Child Class Called");
	}
	
	public static void main(String[] args) 
	{
		ChildMethod(); // Its own method then I call it.
		
		ParentMethod(); // Parent class method call it.
	}
}
