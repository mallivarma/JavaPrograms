package com.pailee.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
		

		String str = "MalleshHiHowAreYou";
		//divide with 3 letters
		//Iterable<String> pieces = Splitter.fixedLength(3).split(string);
		

		List<String> list = new ArrayList<>();
		for(int i=0;i<str.length();i+=3) {
			
			list.add(str.substring(i,Math.min(str.length(), i+3)));
		}
		
		System.out.println(list);
		

		int a[] = {1,2,3,4,5,7};
		//TODOs
		//divide with 3 letters
		//Iterable<String> pieces = Splitter.fixedLength(3).split(string);
		int[] intArray = null;

		List<Integer> l = new ArrayList<>();
		for(int i=0;i<a.length;i+=3) {
			
			intArray = Arrays.copyOfRange(a,i,Math.min(a.length, i+3));
			//System.out.println(intArray);
		}
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
	
		
		
	}

}
