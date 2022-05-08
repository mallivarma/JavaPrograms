package com.pailee.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> strNotEmpty = str.stream().filter(str1->!str1.isEmpty()).collect(Collectors.toList());
		
		System.out.println("Not Empty Values **" +strNotEmpty);
		
		//using for Each
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		
		//using map.
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> numbersList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("Distinct  **" +numbersList);
		
		//sorted
		
		List<Integer> hello = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		List<Integer> helloSorted = hello.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("helloSorted  **" +helloSorted);
		
		List<String> strList = Arrays.asList("USA","India","japan","Canada");
		
		String str1 = strList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("Map working " + str1);
		
	}

}
