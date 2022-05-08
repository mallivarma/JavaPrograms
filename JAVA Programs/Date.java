package com.pailee.practice;

import java.util.Optional;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "2021-02-2T06:00:00.000Z";
		String[] a  = str.split(":");
		String str3 = "2022-10-1T05:00:00.000Z";
		
		System.out.print("new Date   "+a[0]);
		
		String str2 = removeLastCharRegexOptional(a[0]);
		//String str2 = a[0].substring(a[0].length(),1);
		System.out.print("After  Date   "+str2);
	}
	
	public static String removeLastCharRegexOptional(String s) {
	    return Optional.ofNullable(s)
	      .map(str -> str.replaceAll("2T", ""))
	      .orElse(s);
	}

}
