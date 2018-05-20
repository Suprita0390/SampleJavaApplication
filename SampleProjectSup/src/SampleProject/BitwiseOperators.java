package SampleProject;

public class BitwiseOperators {
	
	public static void main(String args[])
	{
		int a=25;   //11001
		int b=15;   //01111
		int c =a & b; //01001 -> value of this is 9
		//Bitwise AND operator compares the values of variables bitwise
	System.out.println("The value of c is " +c);
	
	int d = a | b; // 11111 -> value of this is
	   // Bitwise OR Operator compares 0,1 as 1
	System.out.println("The value of d is " +d);
	}

}
