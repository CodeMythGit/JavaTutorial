package com.codemyth;

public class JavaOperator {

	public static void main(String[] args) {
		int x = 10+5;
		System.out.println(x);
		
		//1. Arithmetic operator
		//2. Assignment operator
		//3. Comparison operator
		//4. Logical operator
		//5. Bitwise operator
		
		//1. Arithmetic operator
		
		// + - * / % ++ --
		
		int num1 = 10;
		int num2 = 5;
		
		//Adition
		System.out.println((num1+"+"+num2)+" = "+(num1+num2));
		
		//Sub
		System.out.println(num1-num2);
		
		//Multiply
		System.out.println(num1*num2);
		
		//Divide
		System.out.println(num1/num2);
		
		// Moduler
		System.out.println(5%2);
		System.out.println(6%2);
	
		System.out.println(num1++);//10->11
		
		System.out.println(++num1);//12
		
		System.out.println(num2--);//5 -> 4
		System.out.println(--num2);//3
	}

}
