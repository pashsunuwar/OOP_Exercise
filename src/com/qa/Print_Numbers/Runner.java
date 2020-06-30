package com.qa.Print_Numbers;

public class Runner {
	
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + ",");
//		}
//		System.out.println();
//		
//		for (int i = 100; i <= 999; i++) {
//			System.out.print(i + ",");
//		}
//		System.out.println();
//		
		
		String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen"}; 
//		for (String unit : units) {	
//			System.out.println(unit);
//		}
//	
		String[] decades = {"", "", "twenty", "thrity", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		for (int i = 0; i < 1000; i++) {
			if (i > 100 && i < 1000) {
				System.out.println(units[i/100] + " hundred and " + decades[i /100] + units[i % 100]);
			}else if (i == 100) {
				System.out.println(units[(i/100)] + " " + "hundered");
			}else if (i > 19) {
				System.out.println(decades[i / 10] + " " + units[i % 10]);	
			} else if (i < 20) {
				System.out.println(units[i]); 
			}
		 
		} 
		
	}
}
