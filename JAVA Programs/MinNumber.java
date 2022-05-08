package com.pailee.practice.p1;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinNumber {

	public static void main(String[] args) {
		
		int a[] = {10,30,15,5,1,0,7};
		
		
		int min = a[0];
		int max = a[a.length-1];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min = a[i];
			}else if(a[i]>max) {
				max = a[i];
				
			}
		}
		System.out.println("Min is "+min);
		System.out.println("Max is "+max);
		
		
		int minNumbers = IntStream.of(a).min().getAsInt();
		System.out.println("Min Stream "+minNumbers);
		
		//IntStream.of(a).min().ifPresent(System.out::println);//static method reference
		
		//min//max//average//sum.
		IntStream.of(a).distinct().sorted().limit(3).forEach(System.out::println);
		
		
		IntSummaryStatistics statics = IntStream.of(a).summaryStatistics();
		
		statics.getMin();
		statics.getMax();
		statics.getAverage();
		statics.getSum();
		statics.getCount();
		
		IntStream.range(1, 10).forEach(System.out::println);
		IntStream.range(1, 10).toArray();//collect into Array
		IntStream.range(1, 10).boxed().collect(Collectors.toList()); //Collect into List
		
		IntStream.of(a).anyMatch(num->num%2==1);//true only if odd any match
		IntStream.of(a).allMatch(num->num%2==1);//true inly all odd match
		
		
		
		
		
	}

}
