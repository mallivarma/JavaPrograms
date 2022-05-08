package com.pailee.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Saanvi1 {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("USA","India","japan","Canada");
		
		List<String> str = strList.stream().filter(x->x.length()>3).collect(Collectors.toList());//whose length is more than 3
		System.out.println("Lenght" + str);
		
		String str1 = strList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println("Map working " + str1);
		

	}

}
