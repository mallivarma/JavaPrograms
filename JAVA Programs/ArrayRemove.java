package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayRemove {

	public static void main(String[] args) {
		

		int a[] = {10,20,30,40,10};
		
		//How to remove duplicates.
		List<Integer> hs = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			
			if(!hs.contains(a[i])) {
				hs.add(a[i]);
			}
		}
		System.out.println(hs);
		
		//Another approach
		
		int b[] = {10,20,30,40,10,20};
		
        Set<Integer> s = new HashSet<>();//Here will remove duplicates
        for(int i=0;i<b.length;i++) {
		s.add(b[i]);
        }
        
        System.out.println("order "+s);
	}

}
