package com.pailee.practice;

public class Test6 {

	public static void main(String[] args) {
		
		
		
		int a[] = {2,5,3,99};
		
		System.out.println("Total Length \n "+a.length);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("List Of integers \n "+a[i]);
		}
		
		
		String str = null;
		
		if(null != str && !str.isEmpty() && str.equalsIgnoreCase("Hello")) {
			System.out.println("Hi");
		}

	}

}
