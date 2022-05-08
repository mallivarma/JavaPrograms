package com.pailee.practice;

public class Swap {

	public static void main(String[] args) {
		

		
		int a = 100,b=200;
		
		
		
		System.out.println("Before Swap " + a +" and "+b );
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap " + a +"and "+b);
		
	}

}
