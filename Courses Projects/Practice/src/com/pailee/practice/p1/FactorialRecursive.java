package com.pailee.practice.p1;

public class FactorialRecursive {

	public static void main(String[] args) {
		

		int fourFactorial = iterativeFactorial(4);
	    System.out.println("hey "+fourFactorial);

	}

	private static int iterativeFactorial(int i) {
		
		int result = 1;
		
		while(i>0) {
			result = result*i;
			i--;		
		}
		return result;
	}

}
