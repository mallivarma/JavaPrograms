package com.pailee.practice;

public class FunctionalDemo implements FunctionalInterface{

	@Override
	public void show() {
	System.out.println("Hi");
		
	}

	
	public static void main(String[] args) {
		

		FunctionalInterface obj = ()->{
			System.out.println("HELLO");
		};
		obj.show();

	}

	
}
