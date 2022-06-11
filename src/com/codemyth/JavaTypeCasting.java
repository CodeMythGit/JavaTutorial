package com.codemyth;

public class JavaTypeCasting {

	public static void main(String[] args) {
		//TypeCasting
		
		//assign a value of one datatype to another datatype
		//1. Widening Typecasting 2. Narrowing Casting
		//byte ->short ->int ->long ->float ->double
		
		byte b = 125;
		
		int a = b;
		System.out.println(a);
		System.out.println(a);
		
		float f = 43.21f;
		int i = (int)f;
		System.out.println(f);
		System.out.println(i);
		
		double d = 123.234234235345;
		float fd = (float)d;
		
		System.out.println(d);
		System.out.println(fd);
	}

}
