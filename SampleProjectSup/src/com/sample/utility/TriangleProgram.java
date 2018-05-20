package com.sample.utility;

public class TriangleProgram {
	
	public boolean triangle(float a, float b, float c)
	{
		float result=a+b+c;
		if(result==180)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
