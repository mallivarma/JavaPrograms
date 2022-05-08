package com.pailee.practice.p1;

public class ArrayIndex {

	public static void main(String[] args) {

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
