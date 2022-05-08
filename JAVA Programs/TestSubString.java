package com.pailee.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestSubString {

	public static void main(String[] args) {
		

		Map<Integer,String> mm = new HashMap<Integer,String>();
		mm.put(1, "Mallesh");
		mm.put(2, "Hello");
		mm.put(3, "Sandy");
		mm.put(4, "Saanvi");
		mm.put(5, "OMI");
		
		for(Entry<Integer, String>  str :mm.entrySet()) {
			//System.out.print(str.getKey()+"    ");
			//System.out.print(str.getValue() +"  ");
		}
		
		for(Integer i : mm.keySet()) {
			//System.out.println(i);
			System.out.print(mm.get(i));
		}
		
		String str = "Malkesh";
		
		char a[] = str.toCharArray();
		
		System.out.println("\n Char Array   " + a.length);//7 letters
		
		System.out.println("\n SubString 0  " + str.substring(0)); //Malkesh
		System.out.println("\n SubString  1 " + str.substring(1)); //alkesh
		System.out.println("\n SubString  2 " + str.substring(2)); //lkesh
		
		System.out.println("\n AGAIN  0,2 " + str.substring(0,2)); //Ma
		System.out.println("\n AGAIN AGAIN  2,5  " + str.substring(2,5));//lke
		System.out.println("\n AGAIN AGAIN  3,4  " + str.substring(3,4));//k
		
		

	}

}
