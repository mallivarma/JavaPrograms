package com.pailee.practice.p1;

import java.util.HashSet;
import java.util.Set;

public class MatchCharacter {

	public static void main(String[] args) {
		

		String str = "MalleshM";
		
		char[] ch= str.toCharArray();

		Set<Character> s = new HashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			
			char c = ch[i];
			if(s.contains(c)) {
				System.out.println("Repeated word is "+c);
				
			}else {
				s.add(c);
			}
		}
	}

}
