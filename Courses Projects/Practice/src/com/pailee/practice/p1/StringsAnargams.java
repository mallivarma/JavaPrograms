package com.pailee.practice.p1;

import java.util.Arrays;

public class StringsAnargams {

	public static void main(String[] args) {
		

		String str1 = "mall";//abcd
		String str2 = "dabc";
		
		if(str1.length()!=str2.length()) {
			System.out.println("GGG Not an anargam");
		}else {
			char[] ch1 = str1.toCharArray();
			
			char[] ch2 = str2.toCharArray();
			
			//Sorting the arrays.
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean  flag = Arrays.equals(ch1,ch2);
			 
		    System.out.print(flag);
		}

	}

}
