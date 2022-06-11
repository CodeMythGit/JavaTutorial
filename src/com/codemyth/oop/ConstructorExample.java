package com.codemyth.oop;

public class ConstructorExample {

	// special method whose name is similar to class name but there is no return
	// type mention
	// default constructor - new object class

	int age;
	String name;

	

	public void methodName() {
		// Todo something
	}

	/* Default constructor */
	public ConstructorExample() {
		System.out.println("inside default");
	}

	/* Parameterized constructor */
	public ConstructorExample(int age1) {
		age = age1;
	}
	
	public ConstructorExample(String name1) {
		name =name1;
	}
	
	public ConstructorExample(String name,int age) {
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample c1 = new ConstructorExample();
		System.out.println(c1.age+" : "+c1.name);
		
		ConstructorExample c2 = new ConstructorExample(10);
		System.out.println(c2.age+" : "+c2.name);
		
		ConstructorExample c3 = new ConstructorExample("Rahul");
		System.out.println(c3.age+" : "+c3.name);
		
		ConstructorExample c4 = new ConstructorExample("Sachin",25);
		System.out.println(c4.age+" : "+c4.name);
	}
}
