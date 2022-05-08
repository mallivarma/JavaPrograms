package com.pailee.practice;

interface PI1{
	
	default void show() {
		System.out.println("Interface Default PI1");
	}
	default void demo() {
		System.out.println("Interface Default Demo in PI1");
	}
}

interface PI2{
	
	default void show() {
		System.out.println("Interface Default PI2");
	}
	
	 static void haShow() {
		 System.out.println("Interface haShow PI2");
	}
}

class GP implements PI1,PI2{

	
	public void show() {
		
		PI1.super.show();
		PI2.super.show();
		PI2.haShow();
	}

	
}

public class DiamondProblem {

	public static void main(String[] args) {
		GP p =new GP();
		p.show();
		p.demo();
		
		

	}

}
