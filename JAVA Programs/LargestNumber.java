package com.pailee.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		
		int n = 3896;
		int t=0;
		List<Integer> ll = new ArrayList<>();
		
		while(n>0) {
			t= n%10;
			n=n/10;
			ll.add(t);
		}
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println("After sort"+ll);
		
		//suppose
	int a[] = {10,40,5,9,20};
	
	Arrays.sort(a);
	
	System.out.println("HURRAY "+a);
	
	for(int i=0;i<a.length;i++) {
		System.out.println("Sort"+a[i]);
	}
	
	System.out.println("Sort lengh "+a.length);
	
	System.out.println("Largest number "+a[a.length-1]);
	
		
		Collections.reverse(ll);
	//Collections.sort(ll,Collections.reverseOrder());

//		for(int i=0;i<ll.size();i++) {
//			Collections.sort(ll);
//		}
//		System.out.print("Last After Sort"+ll);
//		Collections.reverse(ll);
//		System.out.print("Reverse Sort"+ll);
		
		System.out.println("After reverse"+ll);
		int result = 0;
		for(int k=0;k<ll.size();k++) {
		result = result*10;
		result= result+ll.get(k);
		
		}
		System.out.println(result);
		
	}

}
