package com.codemyth.string;

public class StringVsStringBufffer {

	public static void main(String[] args) {
		//String class - Immutable, slower,consume more memory,String constant pool
		//StringBuffer - Mutable,faster,consume less memory,Heap Memory
		
		String s = "Hello";
		System.out.println(s.hashCode());
		
		s = s+" World";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		System.out.println("**************");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.hashCode());
		sb.append(" World");
		System.out.println(sb.hashCode());
	}

}
