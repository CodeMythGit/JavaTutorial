package com.codemyth.string;

public class StripVsTrimStringExample {

	public static void main(String[] args) {

		String s = " String with white spaces ";
		String s1 = s.trim();
		System.out.println(s1);

		String s2 = '\u2001' + " String with white spaces " + '\u2001';
		System.out.println(s2.trim());
		
		System.out.println(Character.isWhitespace('\u2001'));
		
		System.out.println(s2.strip());
	}

}
