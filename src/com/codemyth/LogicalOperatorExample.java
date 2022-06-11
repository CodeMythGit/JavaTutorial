package com.codemyth;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//Logical operator
		// and (&&) 
		// or ||
		// not !
		
//		And true 1 and false 0 (multiply)
	//true and true -> true
		//false and false 
		//true and false -> 1 * 0 =0  false
		
		//Or true 1 and false 0 (add)
		//true or false -> 1+0 => 1 true
		//true or true -> 1+1 => true
		//false or false -> 0+0 => 0  false
		
		
		// !true - > false
		// !false ->true
		
		//And logical operator
		boolean x = (5<10) && (21<20);
		System.out.println(x);
		
		//Or operator
		boolean y = (11<10) || (10<20);
		System.out.println(y);
		
		//negate !
		boolean x1 = !((5<10) && (21<20));
		boolean y1 = !((11<10) || (10<20));
		
		System.out.println(x1);
		System.out.println(y1);
		}

}
