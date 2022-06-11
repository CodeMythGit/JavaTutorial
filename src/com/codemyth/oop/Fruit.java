package com.codemyth.oop;

public class Fruit {
	
	//Property(variables) and method
	
	int count = 10;
	
	public boolean isGood() {
		return true;
	}
	
	public static void main(String[] args) {
//		System.out.println(count);
//		System.out.println(isGood());
		
		//class object
		//ClassName objectName = new ClassName();
		Fruit f = new Fruit();
		System.out.println(f.count);
		System.out.println(f.isGood());
		
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		
		Mango m = new Mango();
		System.out.println(m.count);
		System.out.println(m.isGood());
	}
}
