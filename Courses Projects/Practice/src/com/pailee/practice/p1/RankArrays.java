package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankArrays {

	public static void main(String[] args) {
		
		int a[] = {22, 11, 44, 66, 55};
		
		//how to find rank order elements
		
		List<Integer> hs = new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		Collections.sort(hs);//Arrays.sort(a);

		System.out.println("Sorted order "+hs);
		

		 int count = 0;
		for(Integer st :hs) {
			count ++;
			System.out.print("\n "+ st +"First Order"+count);
		}
		
		
	}

}
