package com.pailee.practice.p1;

public class Reverse {

	public static void main(String[] args) {
		

		String str = "Mallesh";
	
		char ch[] = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(" Dummy " + ch[i]);
		}
		
		int n = 3678;
		int t=0;
		int r=0;
		
		
		while(n>0) {
			t=n%10;
	        n=n/10;
	        r = r*10+t;
	    }	
		System.out.print(" \n Reverse Number "+r);
			
		
		
	}

}
