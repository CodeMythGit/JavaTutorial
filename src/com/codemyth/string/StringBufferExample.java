package com.codemyth.string;

public class StringBufferExample {

	public static void main(String[] args) {
		//String - immutable objects
		//StringBuffer- mutable objects
		String s= "abc";
		String s1 = new String("abc");
		
		StringBuffer sb1 = new StringBuffer();//default = 16
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("CodeMyth"); //s.length + 16 = 24
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println(sb3.capacity());
		
		//append
		sb2.append(" Youtube");
		System.out.println(sb2);
		
		//insert
		sb2.insert(2, "NewWord");//start from 0
		System.out.println(sb2);
		
		//replace
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.replace(0, 4, "ABC");
		System.out.println(sb4);
		
		//delete
		StringBuffer sb5 = new StringBuffer("Hello");
		sb5.delete(0, 4);
		System.out.println(sb5);
		
		//reverse
		StringBuffer sb6 = new StringBuffer("CodeMyth");
		System.out.println(sb6.reverse());
	}

}
