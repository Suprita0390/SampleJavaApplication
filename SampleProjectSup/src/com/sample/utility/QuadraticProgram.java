package com.sample.utility;

public class QuadraticProgram {

	public void CalculateQuadraticSolution(int a,int b, int c)
	{
		int temp1 = ((b*b)-4*a*c);
		double result1 = (-b+Math.sqrt(temp1))/(2d*a);
		double result2 = (-b-Math.sqrt(temp1))/(2d*a);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
