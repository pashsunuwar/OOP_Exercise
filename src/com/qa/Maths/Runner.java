package com.qa.Maths;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner mycalc = new Scanner(System.in);

		int firstnumber, secondnumber;
		String operator;

		System.out.println("Enter your first number: ");
		firstnumber = mycalc.nextInt();

		System.out.println("Choose Arithmetic Operator from '+ - * /': ");
		operator = mycalc.next();

		System.out.println("Enter your second number: ");
		secondnumber = mycalc.nextInt();

		switch (operator) {
		case "+":
			System.out
					.println(firstnumber + " " + operator + " " + secondnumber + " = " + (firstnumber + secondnumber));
			break;
		case "-":
			System.out
					.println(firstnumber + " " + operator + " " + secondnumber + " = " + (firstnumber - secondnumber));
			break;
		case "*":
			System.out
					.println(firstnumber + " " + operator + " " + secondnumber + " = " + (firstnumber * secondnumber));
			break;
		case "/":
			// exception
			try {
				firstnumber = 0;
				secondnumber = 0;
				System.out.println(
						firstnumber + " " + operator + " " + secondnumber + " = " + (firstnumber / secondnumber));
			} catch (ArithmeticException e) {
				// will only execute if any Arithmetic exception occurs in the try block
				System.out.println("You cannot divide a number by zero");
			}

			break;

		}

	}

}
