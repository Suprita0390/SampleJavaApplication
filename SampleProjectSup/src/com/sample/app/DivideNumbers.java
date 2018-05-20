package com.sample.app;

import com.sample.utility.*;

public class DivideNumbers {

	public static void main(String args[]) {

		DivisibleProgram d1 = new DivisibleProgram();
		int a = 55;
		boolean result = d1.Divisible(a);

		if (result) {
			System.out.println(a + " is divisible by 5 and 11");
		} else {
			System.out.println(a + " The number is not divisble by 5 and 11");
		}

	}

}
