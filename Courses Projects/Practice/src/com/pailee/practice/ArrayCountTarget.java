package com.pailee.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayCountTarget {

	public static void main(String[] args) {

	    final int temp;
	    
	    int xyz[] = {1,2,5,10,6};
	    
	    int sum = 7;
	   
	    
	    for(int i=0;i<xyz.length-1;i++) {
	    	for(int j=0;j<xyz.length-i-1;j++) {
	    		
	    		//System.out.println(xyz[i] +"+++"+xyz[j]);
	    		
	    		if(xyz[j] == sum-xyz[i]) {
	    			System.out.println(xyz[i] +" eq "+xyz[j]);
	    		}
	    	}
	    }	
	    
	    final List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        
        System.out.println(myList);
        
        List tmp = new ArrayList();
        tmp.add("four");
        myList.add(tmp);
        
        System.out.println(myList);

	}

}
