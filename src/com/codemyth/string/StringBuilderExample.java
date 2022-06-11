package com.codemyth.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		//StringBuffer - two thread can't call the method of stringBuffer simul. - synchronized(Thread safe)
		//StringBuilder -not synchronized (No Thread safe)
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("Codemyth");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		StringBuilder sb3 = new StringBuilder(14);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		
		//append
		StringBuilder sb4 = new StringBuilder("hello");
		sb4.append(" World");
		System.out.println(sb4);
		
		//insert
		StringBuilder sb5 = new StringBuilder("hello");
		sb5.insert(2, "Word");
		System.out.println(sb5);
		
		//replace
		StringBuilder sb6 = new StringBuilder("hello");
		sb6.replace(2, 4, "World");
		System.out.println("replace");
		System.out.println(sb6);
		
		//delete
		System.out.println("delete");
		StringBuilder sb7 = new StringBuilder("hello");
		sb7.delete(2, 4);
		System.out.println(sb7);
	}

}
