package com.pailee.practice;

public class TagetElement {

	public static void main(String[] args) {
		
		
		int a[] = {10,2,5,15,9};
		int target = 15;
		
		System.out.println("Array Length "+a.length);
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-i-1;j++) {
				//logic
				
				if(a[j]==target-a[i]) {
					 System.out.print("\n Equals letters "+a[i]);
				}
				
			}
		}
		
		int b[] = {2,8,3,7,4,-2};
	    
	    int target1 = 10;
	    
	    int count = 0;
	    
	    for(int i=0;i<b.length;i++){ 
	      for(int j=i+1;j<b.length;j++){
	     
	    	  //System.out.println(b[i] +"***"+b[j]);
	    	  
	    	  if((b[i]+b[j]) == target1) {
	    		  count++;
	    		  System.out.println("\n  **** "+b[i]+b[j]);
	    	  }
	      }
	    } 
	    System.out.printf("\n Count of pairs is %d", count);  


	
	}

}
