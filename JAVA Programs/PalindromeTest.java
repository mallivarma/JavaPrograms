package com.pailee.practice;

public class PalindromeTest {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		System.out.println("Length "+str.length());//4
		System.out.println("Length substring "+str.substring(0,str.length()-1));//ac
		
		String str1 = "aba";
		
		//str1 = str1.substring(0,str1.length()-1);
		
		System.out.println("Length str1 ** "+str1.charAt(str1.length()-1));//d
		
		String reverse = reverse(str);
		
		if(str.equals(reverse)) {
			System.out.println("Polyndrome");
		}else {
			System.out.println(" Not Polyndrome");
		}
		

	}

	private static String reverse(String str) {
		
		if(str == null || str.isEmpty()){
			return str;
		}

		return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
	}

}
