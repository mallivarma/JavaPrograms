package com.pailee.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> strNotEmpty = str.stream().filter(str1->!str1.isEmpty()).collect(Collectors.toList());
		
		System.out.println("Not Empty Values **" +strNotEmpty);
		
		
		List<Boolean> s1 = str.stream().map(st->!st.isEmpty()).collect(Collectors.toList());//Returns boolean
		
		System.out.println(s1);
		
		//using for Each
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		
		
		//using map.
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> numbersList = numbers.stream().map(i->i*10).distinct().collect(Collectors.toList());
		System.out.println("Distinct  **" +numbersList);
		
		//sorted
		
		List<Integer> hello = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		List<Integer> helloSorted = hello.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("helloSorted  **" +helloSorted);
		
		List<String> strList = Arrays.asList("USA","India","japan","Canada");
		
		String str1 = strList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("Map working " + str1);
		
		List<Integer> list1 = Arrays.asList(0, 3, 5, 7, 1, 4, 9, 1, 6, 2, 8);
	//	List<Integer> list2 = list1.stream().collect(Collectors.groupingBy(e->e.toString()));
		
	}

}
