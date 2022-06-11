package com.codemyth;

public class SwitchCaseExample {

	public static void main(String[] args) {
//key - int,String,char,Enum
		// double,float
//		key = variable name,expression
		int age = 25;
		switch (age) {
		case 25:
			System.out.println("Age is 25");
//			break;
		case 26:
			System.out.println("Age is 26");
			break;
		default:
			System.out.println("age is not valid");
			break;
		}

		char c = 'c';
		switch (c) {
		case 'a':
			System.out.println("Name is rahul");
			break;
		case 'b':
			System.out.println("Name is Sachin");
			break;
		default:
			System.out.println("Name is not valid");
			break;
		}
	}

}
