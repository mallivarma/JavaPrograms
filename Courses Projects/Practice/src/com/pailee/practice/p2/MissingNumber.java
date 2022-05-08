package com.pailee.practice.p2;


import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		

		
		int a[] = { 1, 2,3,4, 5, 6,8,9 };
		
		
		int n = a.length-1;
		
		int sumTotal = ((n+1)*(n+2))/2;
		
		for(int i=0;i<a.length-1;i++) {
			sumTotal=sumTotal-a[i];
		}
		
		System.out.println(sumTotal);
		
		//another approach
		
		
	    int[] numbers = {1,2,3,4,5,6,7,8,9,11,12};
	    
	    System.out.println("largest  number "+numbers[numbers.length-1]);
	    
	    
        int Largestlength = numbers[numbers.length-1];
        
        int idealSum = (Largestlength * (Largestlength + 1)) / 2;
        
        System.out.println("idealSum "+idealSum);
		//Now calculate all the numbers.
         
        int sumArray = calculateSum(numbers);
        
        System.out.println("sumArray "+sumArray);
        
        int missing = idealSum-sumArray;
        System.out.println(missing);
	}

	private static int calculateSum(int[] numbers) {
		int sumArray = 0;
        for(int sum:numbers) {
        	sumArray += sum;
        }
		return sumArray;
	}

}
