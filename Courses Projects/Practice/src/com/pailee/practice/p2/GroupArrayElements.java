package com.pailee.practice.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupArrayElements {

	public static void main(String[] args) {
		
		Integer number = null;
		Stream<Integer> result = null;//Stream.ofNullable(number);
		//result.map(x -> x * x).forEach(System.out::println);
		
		System.out.println(result);
		/*
		Stream.iterate(1, i -> i + 1)
        .filter(x -> x <= 10)
        .map(x -> x * x)
        .forEach(System.out::println);
		/*
		Employee firstEmp = empList.stream()
			      .min((e1, e2) -> e1.getId() - e2.getId())
			      .orElseThrow(NoSuchElementException::new);
		
		//and also another way
		 
	   Employee maxSalEmp = empList.stream()
      .max(Comparator.comparing(Employee::getSalary))
      .orElseThrow(NoSuchElementException::new);
		
		*/
		

		int  a[] = {10,3,5,8,5,1,4,7,7};
		List<String> list = new ArrayList<>();
		
		//group by 3
		int chunk = 3; // chunk size to divide1479
		
		for(int i=0;i<a.length;i+=chunk){
		   // System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, Math.min(a.length,i+chunk))));
			int[] intArray =  Arrays.copyOfRange(a, i, Math.min(a.length,i+chunk));
			System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, Math.min(a.length,i+chunk))));
			int max = findMaxValue(intArray);
			int min = findMinValue(intArray);
			System.out.println(max+","+min);
		}
		
		System.out.println(list);
	
	
		

	}

	private static int findMaxValue(int[] array) {

		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
			
		return max;
	}
	private static int findMinValue(int[] array) {

		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
			
		return min;
	}

}
