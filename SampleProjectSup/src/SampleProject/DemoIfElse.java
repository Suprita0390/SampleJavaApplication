package SampleProject;

public class DemoIfElse {

	//Find even and odd number
	public static void main(String args[])
	{
		int num1 = 100;
		if(num1% 2==0)
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
		
		
	//Find largest number using if-else if - else
		int a=10;
		int b=12;
		int c=9;
		
		System.out.println("Checking largest number..");
		if (a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	
	
}
