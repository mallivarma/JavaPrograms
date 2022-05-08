package com.pailee.practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<StringBuffer> ts = new TreeSet<>();
		 
        // Elements are added using add() method
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
 
        // StringBuffer implements Comparable interface
		//ts.add("A");
		//ts.add("G");
		
		
        System.out.println(ts);
        
		
	}

}
