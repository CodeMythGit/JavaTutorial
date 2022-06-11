package com.codemyth.method;


class Parent{
	public void mult(int a,int b) {
		System.out.println("inside Parent mult method");
		System.out.println(a*b);
	}
	
	public void printA() {
		System.out.println("A");
	}
}

class Child extends Parent{

	@Override
	public void mult(int a, int b) {
		System.out.println("inside Child mult method");
		System.out.println(a*b*2);
	}
	
	public void printA() {
		System.out.println("A inside child");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.mult(3, 4);
		
		Child c = new Child();
		c.mult(3, 4);
		
		
		Parent pc = new Child();
		pc.mult(4, 5);
		
		pc.printA();
		
		
	}

}
