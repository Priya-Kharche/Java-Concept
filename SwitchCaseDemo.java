package ab52;

import java.util.Scanner;

public class SwitchCaseDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Please any enter any number:");
	Scanner s1 = new Scanner(System.in);
	int num = s1.nextInt();
	switch(num)
	{
	case 1: System.out.println("Chrome Browser");
	break;
	
	case 2: System.out.println("Edge Browser");
	break;
	
	case 3: System.out.println("Mozilla Browser");
	break;
	
	case 4: System.out.println("Safari Browser");
	break;
	
	default: 
		System.out.println("Invalid");
		
	s1.close();
	}

}}
