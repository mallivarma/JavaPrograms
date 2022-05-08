package com.pailee.practice;

public class Test5 {

	
	
	public static void main(String[] args) {
		
		String reverseString = "Saanvi";
		
		String recursive = "Malli";
		
		char[] a  = reverseString.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=a.length-1;i>=0;i--) {
			sb.append(a[i]);
		}
		
		System.out.println("Reverse *****" +sb.toString());
		System.out.println("Recursive String *** "+recursive(recursive));
		
		
	}
	
	private static String recursive(String str) {
		
		if(str.length()<2) {
			return str;
		}
		
		return str.substring(0)+str.charAt(0);
		
	}
}
