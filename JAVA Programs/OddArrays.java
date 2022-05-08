package com.pailee.practice.p1;

public  class OddArrays {

	//public abstract final void m1();
	
	public static void main(String[] args) {
		
		final int  f =0;//Error Only final is permitted public int temp;
		
		int a[] = {22, 11, 44, 66, 55};
		
		
		//first write odd/even numbers.
		
		int even =0;
		int odd =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				odd++;
				
			}else {
				even++;
				
			}
		}

		System.out.println("ODD "+odd);
		System.out.println("EVEN "+even);
	}

}
