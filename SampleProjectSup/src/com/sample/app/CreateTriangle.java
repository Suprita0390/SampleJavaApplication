package com.sample.app;

import com.sample.utility.*;

public class CreateTriangle {
	
	public static void main(String args[])
	{
		float a=55.5f, b=69.3f,c=55.2f;
		TriangleProgram t1= new TriangleProgram();
		boolean result=t1.triangle(a,b,c);
		if(result==true)
		{
			System.out.println("this is valid triangle");
		}
		else
		{
			System.out.println("This is invalid traingle");
		}
		
	}
}
