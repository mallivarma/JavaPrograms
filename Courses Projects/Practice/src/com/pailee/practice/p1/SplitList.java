package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitList {

	public static void main(String[] args) {
		
		//Split a list into two sublists
		
		 List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5,7,9);
		 
	        // get the mid-index for splitting the input list into two
	        int midIndex = (inputList.size() - 1) / 2;
	 
	        Map<Boolean, List<Integer>> map = inputList.stream()
	                .collect(Collectors.groupingBy(s -> inputList.indexOf(s) > midIndex));
	      
	        System.out.println(map);
	 
	        List<List<Integer>> lists = new ArrayList<>(map.values());
	 
	        System.out.println("The first sublist is " + lists.get(0));
	        System.out.println("The second sublist is " + lists.get(1));
		
	}

}
