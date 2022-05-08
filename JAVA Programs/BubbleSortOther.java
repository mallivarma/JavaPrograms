package com.pailee.practice.p1;

public class BubbleSortOther {

	public static void main(String[] args) {
		

		int a[] = {5,10,2,9,25,67};
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				
				}
			}
		}
		for(int i=0;i<a.length;i++ ) {
			System.out.println("After sort"+a[i]);
		}

	}

}
