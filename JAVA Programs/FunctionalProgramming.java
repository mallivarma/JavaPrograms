package com.pailee.practice;


interface AAA{
	
	default void show() {
		System.out.println("Show Demo");
	}
}

public class FunctionalProgramming {

	public static void main(String[] args) {
		

		//AAA a = ()->{
		//	System.out.println("SF");//This will work only for lamda expression remove extra code.
      	//};//The target type of this expression must be a functional Interface
		//a.show();
		
		AAA a1;
		a1 = new AAA() {
			
		};
       a1.show();
	}

}
