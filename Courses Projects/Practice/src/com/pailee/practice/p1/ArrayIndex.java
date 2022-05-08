package com.pailee.practice.p1;

public class ArrayIndex {

	public static void main(String[] args) {
			 

		Boolean b1 = true;
		
		if(b1) {
			System.out.println(b1);
		}
		
		boolean b2= false;
		
		if(b2) {
			System.out.println(b2);
		}

		int a[]= {10,20};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Array Element"+a[i]);
		}
		
		int b[] = new int[2];
		b[0] = 30;
		b[1] = 40;
		
		for(int j=0;j<b.length;j++) {
			System.out.println("Let's see "+b[j]);//<= equals used so got IO Exception
		}
		

	}

}
