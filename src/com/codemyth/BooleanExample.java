package com.codemyth;

public class BooleanExample {

	public static void main(String[] args) {
		boolean variableName = false;
		
		int age = 30;
		
		if(age>20) {
			System.out.println("Age is greater than 20");
		}else if(age==20) {
			System.out.println("Age is equal to 20");
		}else {
			System.out.println("Age is less than 20");
		}
		
		boolean isGood = true;
		
		if(isGood) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
