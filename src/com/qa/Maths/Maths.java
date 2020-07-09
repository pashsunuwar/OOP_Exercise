package com.qa.Maths;

import java.util.Scanner;

public class Maths {
	Scanner myCalc = new Scanner(System.in);

	switch(operator)
	{
	case "+" :
		System.out.println("Adding the two operands equal to " + (firstnumber + secondnumber));
		break;	
	case "-" :
		System.out.println("Subtracting the two operands equal to " + (firstnumber - secondnumber));
		break;
	case "*" :
		System.out.println("Multiplying both operands equal to " + (firstnumber * secondnumber));
		break;
	case "/" :
		System.out.println("Divinding both operands equal to " + (firstnumber / secondnumber));
		break;
	
	}
}}
