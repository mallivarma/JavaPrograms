package com.pailee.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InterviewTest {

	public static void main(String[] args) {
		
		String str = "Mallesh";
		
		
		char ch[] = str.toCharArray();
		
		HashSet<Character> s = new HashSet<Character>();
		List<Character> s1 = new ArrayList<Character>();
		
		for(int i=0;i<ch.length;i++) {
			
			//char c = ch[i];
			if(s1.contains(ch[i])) {
				System.out.print("Repeated Occurance   "+ch[i]);
			}else {
				s1.add(ch[i]);
			}
				
			}
		}
		
	

}
