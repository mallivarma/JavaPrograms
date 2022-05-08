package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExamples {

	public static void main(String[] args) {
		
		
		List<String> str = Arrays.asList("Amma","Bujji","Amma","Bujji");
		//Remove duplicates from a string.
		
		Set<String> st = new HashSet<>();
		
		for(String s : str) {
			
			if(!st.contains(s)) {
				st.add(s);
			}
		}
		System.out.println(st);
		
		List<String> str1 = Arrays.asList("Amma","Bujji","Amma","Bujji");
		
		
		List<String> res = str1.stream().filter(x->x.contains(x)).distinct().collect(Collectors.toList());
		
		System.out.println(res);
		
		List<Integer> xList = Arrays.asList(100,200,400,100);
		List<Integer> xx = new ArrayList<>();
		for(Integer s :xList) {
			if(!xx.contains(s)) {
				xx.add((s));
			}
			
		}
		System.out.println(xx);
		
		List<Integer> listResult = xList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(listResult);
	}

}
