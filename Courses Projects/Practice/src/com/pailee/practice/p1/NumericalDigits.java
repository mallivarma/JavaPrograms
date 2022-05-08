package com.pailee.practice.p1;

public class NumericalDigits {

	public static void main(String[] args) {
		
		String str = "Mallesh301";
		
		str = str.replaceAll("\\d", "");
		
		int length = str.length();
		
		System.out.println("Lengh of the String" +length);
		

	}

}
