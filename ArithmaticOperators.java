package ab52;

public class ArithmaticOperators
{
	static void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is: " + c);
	}
	
	static void sub()
	{
		int a = 200;
		int b = 300;
		int c = b-a;
		System.out.println("Subtraction is:" + c);
	}
	
	static void mul()
	{
		int a = 10;
		int b = 20; 
		int c = a*b;
		System.out.println("Multiplication is:" +c);
	}
	
	static void div()
	{
		int a = 20;
		int b = 5;
		int c = a/b;
		System.out.println("Division is:" + c);
	}
	
	static void mod()
	{
		int a = 30;
		int b = 2;
		int c = a%b;
		System.out.println("Modulo is:" +c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
