
public class Solution {

	public static void main(String[] args) {
		

	    int a[] = {3,6,1,5,9};
	    
	    int target = 9;
	    
	    for(int i=0;i<a.length-1;i++){ 
	      for(int j=0;j<a.length-i-1;j++){
	     
	    	  
	        if(a[j] == target - a[i]){
	          
	         System.out.println(a[i]+"**"+a[j]);
	        }
	        
	      }
	    }
	    

	}

}
