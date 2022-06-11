package com.codemyth.string;

public class StringManipulationExample {

	public static void main(String[] args) {
		String s1 = "codemyth";
		
		String s2 = new String("codemyth1");
		
		System.out.println("Length");
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println("--Uppercase--");
		System.out.println(s1.toUpperCase());
		
		//concatenation
		// +,concat
		
		s1 = "Hello";
		s2 = "World";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		
		System.out.println("--Lowercase--");
		System.out.println(s1.toLowerCase());
	}

}
