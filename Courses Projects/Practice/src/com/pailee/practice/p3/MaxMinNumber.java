package com.pailee.practice.p3;

import java.util.Arrays;

public class MaxMinNumber {

	public static void main(String[] args) {
		

		int a[]= {10,3,6,20,7,1,-2};
		
		int max = a.length-1;
		int min = a[0];
		
		//Arrays.sort(a);//optional
		
		for(int i =0;i<a.length;i++) {
		
			if(a[i]>max) {
				max = a[i];
				
			}else if(a[i]<min){
				min= a[i];
			}
		}
		
		System.out.println("Min is "+min);
		System.out.println("Max  is "+max);
		
		//Binary search with target element
		//suppose target element 10;
		
		
		
		Boolean b = binarySearchTarget(a);
		
		System.out.println("Binary search " + b);
	
	}

	private static boolean binarySearchTarget(int[] a) {
		int target = 4;
		int min1 = 0;
		int max1 = a.length-1;
		while(min1<=max1) {
			
			int middle = (min1+max1)/2;
			
			if(target>a[middle]) {
				min1 = middle+1;
			}else if(target<a[middle]) {
				max1 = middle-1;
			}else {
				return true;
			}
		}
		return false;
	}

}
