package com.pailee.practice;

public class Test4 {

	public static void main(String[] args) {
		
		 int nums[] = {2,7,11,5};//4 size
	      int target = 9;
	        for(int i=0;i<nums.length;i++){ //1,2,3,4,5
//	           //System.out.println(nums[i]);
//	           for(int j=0;j<nums.length-1;j++) { //1,2,3,4
//	        	   if(nums[i]>nums[j]) { 	        		   
//	        		// System.out.println(nums[i]);
//	        	   }
//	        		  System.out.println(nums[j] + "\n");	        		
//	        		  if(target == nums[i]+nums[j]) {	        			  
//	        			  System.out.print("Equals letters");	        			  
//	        			  System.out.print(nums[j] +"AND"+nums[i]);//[0,1]
//        		  }
//	        		   
//	        	   }
	        	 for (int j = i + 1; j < nums.length; j++) {
	                 if (nums[j] == target - nums[i]) {
	                	 System.out.print("Equals letters " +nums[i] +" hi "+nums[j]);
	                 }
                  }
	        }
	}

}
