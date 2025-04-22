//A43 - WAP on super calling statement using non-parameterized super calling statement

package ab52;

class GoogleSuper
{
	GoogleSuper() 
	{
		System.out.println("I am a Constructor 2.");
	}
}

public class A43SuperCallingwithNonPara extends GoogleSuper
{
	A43SuperCallingwithNonPara()
	{
		super();
		System.out.println("I am a Constructor 1.");
	}
	public static void main(String[] args) 
	{
		new A43SuperCallingwithNonPara();
	}

}
