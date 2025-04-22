// A54 - WAP on Multiple Level Inheritance 

package ab52;

class grandpa  //Parent class
	{
		void GrandpaMethod()
		{
			System.out.println("This is my Grandpa...");
		}
	}

	class parent extends grandpa  // // Child class inheriting from granpa
	{
		void ParentMethod()
		{
			System.out.println("This is my Parents...");
		}
	}

	public class A54MultiLevelInheritance extends parent
	{
		
		void Me()
		{
			System.out.println("This is Me...");
		}
		public static void main(String[] args) 
		{
			A54MultiLevelInheritance A54 = new A54MultiLevelInheritance();
			A54.Me(); 
			A54.ParentMethod();  
			A54.GrandpaMethod();  

		}

	}


