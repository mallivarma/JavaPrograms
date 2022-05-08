package com.pailee.practice;

public class PolindromeInteger {

	public static void main(String[] args) {
		

		int n=455;
		
		int isPolindrom=n;
		int t=0;
		int r=0;
		
		while(n>0) {
			
			t=n%10;
			n=n/10;
			r=r*10+t;
			
		}

		if(isPolindrom == r) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		String str = "MAM";
		
		char[] ch = str.toCharArray();
		StringBuilder sub = new StringBuilder();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			sub.append(ch[i]);
		}
		
		System.out.println(sub.toString());
		
		if(str == sub.toString() || str.equalsIgnoreCase(sub.toString())){
			System.out.println("YES");	
			
		}else {
			System.out.println("NO");
		}
		
	}

}
