package com.pailee.practice;


interface Abc{
	
	 void show();
}

public class InterfaceDemo {

	public static void main(String[] args) {
		

		Abc obj=()->{
			System.out.println("Hello");
		};
		obj.show();

	}

}
