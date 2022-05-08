package com.pailee.practice.p1;

public class VowelsString {

	public static void main(String[] args) {
		

		String str = "Mallesh";
		
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
				count++;
				
			}
		}
		System.out.println("No of vowels Type I  "+count);
		
		
		//And also another way
		
		String str1 = "Mallesh";
		
		int c = 0;
		char ch[] = str1.toCharArray();
		for(Character s : ch) {
			
			if(s == 'a' || s=='e' || s=='i' || s=='o' || s=='u') {
				c++;
			}
		}
		System.out.println("No of Vowels type II  "+c);

	}

}
