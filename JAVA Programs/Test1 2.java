package com.pailee.practice;

public class Test1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Mallesh";
		
		String b = new String("Mallesh");
		System.out.println(a.equals(b));//0,0,1,2,3,5,8 febonacci series
		
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;
		
		for(int i=0;i<=10;i++) {
			sum=firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum; 
			System.out.println("\n febonacci series"+sum);
		}
		
		
		
		
		int []array = {1,2,3,4,5,6};
		int length = array.length-1;//6-1
		System.out.print("Reverse of an Array length **\n "+length);
		while(length>=0) {
			System.out.print("&&& "+array[length]);//Reverse of an Array
			length--;
		}
		
		
		int x[] = {12,4,6,19};
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(" \n REVERSE"+x[i]);
		}
		
		
		//6,5,4,3,2,1
		
		int b1[][] = 	{{1,2,3},{2,2,1},{0,43,2}};
		
		System.out.print(" \n B1 Value First "+b1[0][2]);
		System.out.print("\n B1 Value Second "+b1[2][1]);
		
		int a1[][] = new int[3][];
		a1[1] = new int[] {1,2,3}; 
		a1[2] = new int[] {4,5}; 
		
		System.out.print("\n B2 Value  "+a1[1][1]);
		//System.out.print("\n B3 Value  "+a1[0][1]);
		
		System.out.print("\n B4 Value  "+a1[1][0]);
		System.out.print("\n B5 Value  "+a1[2][1]);
		
		
		String s = "Mallesh";
		s.concat("Java");
		s.toLowerCase();
		System.out.print(" \n Immutable String s ="+s);
		
		
	}

}
