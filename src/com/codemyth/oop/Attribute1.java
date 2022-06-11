package com.codemyth.oop;

public class Attribute1 {
	
	int a = 10;
	int b= 20;
	String name= "Rahul";

	public static void main(String[] args) {
		//creating an attributes
		//attributes/field/property/variable
		
		Attribute1 att1 =new Attribute1();
		System.out.println(att1.a);
		
		Attribute1 att2 =new Attribute1();
		System.out.println(att2.b);
		System.out.println(att2.name);
	}

}
