package com.pailee.practice.p1;

public class BubbleSortEx {

	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,3,5,11,4};
		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}	
				
			}
			
		}
		for(int i=0;i<a.length;i++ ) {
			System.out.println("After sort"+a[i]);
		}

	}

}
