package com.pailee.practice;

import java.util.ArrayList;
import java.util.List;

public class CharacterString {

	public static void main(String[] args) {
		
		
		String str = "MalleshM";
		
		//found how many a's are here
		
		char[] ch = str.toCharArray();
		int count = 0;
		List<Character> st = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++) {
			
			//char s = ch[i];

			if (st.contains(ch[i])) {

				System.out.println("Repeated word is " + ch[i]);
			} else {
				st.add(ch[i]);
			}
			
		}

	}

}
