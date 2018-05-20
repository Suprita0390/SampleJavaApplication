package SampleProject;

public class ShiftOperators {
 
	public static void main(String args[])
	{
		//Right shift operators
		int a=25; // binary value of 25 is 11001
		int b= a>>2;//it eliminates 2 values from right -> 110 remians ->
		System.out.println("The value of b is " +b);
		
		//Left Shift Operators
		int c =a<<2;//it adds 2 00 at the end of the binary value - 1100100
		System.out.println("The value of c is " +c);
	}
}
