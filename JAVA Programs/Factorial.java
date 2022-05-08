package com.pailee.practice.p1;

public class Factorial {

	public static void main(String[] args) {
		

		int n = 10;
		
		
		String emp1="Mallesh";
		String emp2 = emp1;
		
		 emp1 = "Hello";
		 
		 System.out.println(emp2);
		
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(" Order "+i);
			}
		}

	}

}
