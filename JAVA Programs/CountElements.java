package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElements {

	public static void main(String[] args) {
		

		List<Integer> aList = Arrays.asList(10,20,3,5,5,10);
				
		Map<Integer,Integer>  frequencyMap = new HashMap<Integer,Integer>();
		
		for(Integer a : aList) {
			if(frequencyMap.containsKey(a)) {
				frequencyMap.put(a,frequencyMap.get(a)+1 );
			}else {
				frequencyMap.put(a,1);
			}
			
		}
		
		System.out.println(frequencyMap);
		
		
		int a[] = {1,2,3,5,5,2};
		
		Map<Integer,Integer>  f = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(f.containsKey(a[i])) {
				f.put(a[i],f.get(a[i])+1 );
			}else {
				f.put(a[i],1);
			}
			
		}
		
		System.out.println("here ***"+ f);
		
		
		 List<String> duplicateList = new ArrayList<String>();
	        duplicateList.add("Cat");
	        duplicateList.add("Dog");
	        duplicateList.add("Cat");
	        duplicateList.add("Cow");
	        duplicateList.add("Cow");
	        duplicateList.add("Goat");          
	        Map<String, Long> couterMap = duplicateList.stream().
	        		collect(Collectors.groupingBy(e->e.toString(),Collectors.counting()));
	        System.out.println(couterMap);
	        
	        List<Integer> numberList = Arrays.asList(1,2,3,4,5,3,4,2,1,5,2,3,4,5);
			//using Streams
			Map<Integer, Long> numberCountMap = numberList.parallelStream().collect(Collectors.
					groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(numberCountMap);
			
	
	
	List<String> ll = Arrays.asList("Cat","Dog","Cat","Cow","Goat","Goat");
	
	Map<String,Integer> hsMap = new HashMap<String,Integer>();
	
	   for(String itr : ll) {
		
		if(hsMap.containsKey(itr)) {
			hsMap.put(itr, hsMap.get(itr)+1);
			
		}else {
			hsMap.put(itr, 1);
			
	    }
     }
	
	  System.out.println("Now " + hsMap);
	  
	  
	  String str = "Hi How are you Hi are";
	  String st[] = str.split(" ");
	  
	  Map<String,Integer> hs = new HashMap<>();
	  
	  for(String s : st) {
		  
		  if(hs.containsKey(s) || hs.get(s)!=null) {
			  hs.put(s, hs.get(s)+1);
		  }else {
			  hs.put(s, 1);
		  }
	  }
	  System.out.println("Count + "+hs);

	
	class Person{
		
		int age;
		int name;
		
		
	}
	
	}
	
}
