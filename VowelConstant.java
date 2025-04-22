package EshanJava;

public class VowelConstant 
{
	public static void main(String[] args) 
	{
		String a = "Sandhya";
		String b = a.toLowerCase();
		
		int vowel = 0;
		int consonant = 0;
		
		for(int i = 0; i<=b.length(); i++)
		{
			if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'|| b.charAt(i) == 'u')
			{
				System.out.println("Vowel is " + b.charAt(i ) + "is" + i);
				vowel++;
			}
			else
			{
				System.out.println("Consonant is " + a.charAt(i ) + "is" + i);
				consonant++;
			}
		}
		System.out.println("Vowels are " + vowel);
		System.out.println("Consonants are " + consonant);
		
		

	}

}
