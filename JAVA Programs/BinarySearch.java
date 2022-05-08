package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	
	static int a=100;//Which is a class loader variable.
	
	public static void main(String[] args) {
		
		

		List<Integer> str = Arrays.asList(10,20,30,40,50);
		
		//collections should be sorted before performing binary search,lets see
		
		Collections.sort(str);
		System.out.println(str);
		
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);//0
        numbers.add(2);//1
        numbers.add(3);//2
		
		int pos = Collections.binarySearch(numbers, 3);
		
		a = 200;

		System.out.println(pos);
		System.out.println("Static   " +a);
	}

}
