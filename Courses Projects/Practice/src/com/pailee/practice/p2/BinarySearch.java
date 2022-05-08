package com.pailee.practice.p2;

public class BinarySearch {

	public static void main(String[] args) {
		

		int a[] = {1,3,5,7,9,19};
		
		int target = 9;
		
		for(int i=0;i<a.length-1;i++) {
			if(target == a[i]) {
				System.out.println(i);
			}
		}
		
		//binary search.
		
		boolean index = binarySearch(a,target);
		
		System.out.println(index);
		
		//Binary search time complexity would be O(log n).
		//Best case would be O(n).
		//Quick sort would be the best one - O(n logn).

	}

	private static boolean binarySearch(int[] a, int target) {
	
		if(a.length==0) {
			return false;
		}
		
		int low = 0;
		int high = a.length-1;
	
		while(low<=high) {
			int middle = (low+high)/2;
			
			if(target>a[middle]) {
				low = middle+1;
			}else if(target<a[middle]) {
				high = middle-1;
			}else {
				return true;
			}
		}
		
		return false;
	}

}
