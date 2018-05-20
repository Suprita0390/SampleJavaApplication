package com.sample.app;

import com.sample.utility.CalculatorUtility;

public class CreateCalculatorApp {
	public static void main(String args[])
	{
		CalculatorUtility calc= new CalculatorUtility();
		int result=calc.add(500, Integer.MAX_VALUE);
		System.out.println(result);
	}

}
