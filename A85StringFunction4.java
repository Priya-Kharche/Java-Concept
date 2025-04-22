//A85 - WAP on string functions using replace, replaceAll, substring, matches, repeat
package ab52;

public class A85StringFunction4 {

	public static void main(String[] args) 
	{
		//replace string function.
		String input1= "ram tiwari";
		String output1 = input1.replace("tiwari", "rai");
		System.out.println("Replace string: "+ output1);
		
		//replace string function.
		String input= "k v no 2";
		String output = input.replaceAll("[0-9]", " ");
		System.out.println("Replace all string: "+ output);
		
		//substring string function.
		String input2= "manish tiwari";
		String output2 = input2.substring(7);
		System.out.println("Substring: "+ output2);
		
		 //repeat function
		String string="abc"; 
	     int count=3; 
	     System.out.println("String :"+string.repeat(count));
		

	      String s = "JavaProgramming";
	      // Check if the string contains only alphabets
	      boolean r = s.matches("[a-zA-Z]+"); // Matches only alphabets (case-insensitive)
	      System.out.println("" + r);
		
		

	}

}
