package com.pailee.practice.p1;

public class PolindromeString {

	public static void main(String[] args) {
		
		
		 if(isPolindrom("aba").equals("aba")) {
			 System.out.println("Polindrome");
		 }else {
			 System.out.println("Not Polindrome");
		 }
		 		 
	}

	private static String isPolindrom(String str) {
		
		if(str == null || str.isEmpty()){
			return str;
		}
		
		
		return str.charAt(str.length()-1)+isPolindrom(str.substring(0,str.length()-1));
		
		
	}

}
