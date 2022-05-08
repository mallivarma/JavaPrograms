package com.pailee.practice.experience;

import java.util.Collections;

public class SecondHighest {

	public static void main(String[] args) {
		

		int a[] = {1,2,3,4,10,45,76,6};
	
		int high = 0;
		int nextHigh = 0;
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			

			if(a[i]>high) {
				nextHigh = high;
				high = a[i];
			}else if(a[i]>nextHigh) {
				nextHigh = a[i];
			}
		}
		
		System.out.println("second highest"+nextHigh);
		System.out.println("first highest"+high);
		

	}

}
