package com.pailee.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int a[] = {22,4,1,78,99,45,34};
		
		// Sorting Integer using bubbleSort
		
		System.out.println("Sort Length "+a.length);
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-i-1;j++) {
			 
				if(a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;		
				}	
			}
		}
		System.out.println("Sorted array");
		for (int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
		}
        
        
       // Sorting String using bubbleSort
//        
       String str[] = {"b","a","z","j","l"};
//       
//        for(int aa=0;aa<str.length-1;aa++) {
//        	for(int bb=aa+1;bb<str.length-1;bb++) {
//        		
//        		if(str[aa].compareTo(str[bb])>0) {
//        			String temp = str[aa];
//        			str[aa] = str[bb];
//        			str[bb] = temp;
//        			
//        		}
//        	}
//       }
       
       //below is working
       for(int x=0;x<str.length-1;x++) {
        	for(int y=0;y<str.length-x-1;y++) {
        		
        		if(str[y].compareTo(str[y+1])>0) {
        			String temp = str[y];
        			str[y] = str[y+1];
        			str[y+1] = temp;
        		}
       	}
       }
        
        System.out.println("Sorted String array");
		for (int i=0; i<str.length; ++i)
            System.out.print(str[i] + " ");
        System.out.println();
        
        //Now lets see how to use Streams
        
        int b[] = {10,5,6,78,9};
        List<Integer> str1 = new ArrayList<>();
        
        for(int i=0;i<b.length;i++) {
        	str1.add(b[i]);
        }
        
       List<Integer> str2 =  str1.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(str2);
        
        
        String st[] = {"b","a","d","k","r"};
        List<String> hh = new ArrayList<String>();
        for(String s : st) {
        	hh.add(s);
        }
        System.out.println("Before String sort "+hh);
     
        System.out.println(hh.stream().distinct().sorted().collect(Collectors.toList())); 
	}

}
