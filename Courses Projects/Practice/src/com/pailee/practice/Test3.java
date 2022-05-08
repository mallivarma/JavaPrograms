package com.pailee.practice;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		   Map<String,String> gfg = new HashMap<String,String>(); 
		   
	        gfg.put("GFG", "geeksforgeeks.org"); 
	        gfg.put("Practice", "practice.geeksforgeeks.org"); 
	        gfg.put("Code", "code.geeksforgeeks.org"); 
	        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
	          
	       gfg.forEach((key,value) -> System.out.println("Key"+key +"Value "+value));
	        
	         
	       int[] nums = {1,2,3,4,5};
	       
	        for(int i=0;i<nums.length;i++){
	            System.out.println(nums[i]);
	        }
	    
	
	    } 
	

}
