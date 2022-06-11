package com.codemyth.method;

class Calc{
	
	//method signature diff
	//parameter must be diff
	//method name must be same
	//return type may or may not be same
	public int add(int a,int b) {
		System.out.println("inside int add method");
		return a+b;
	}
	
	
	public float add(float a,float b) {
		System.out.println("inside float add method");
		return a+b;
	}
	
	public double add(double a,double b) {
		System.out.println("inside double add method");
		return a+b;
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(1.0f, 2.0f));//by default double
	}

}
