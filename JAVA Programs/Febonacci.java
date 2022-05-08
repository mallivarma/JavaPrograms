package com.pailee.practice;

public class Febonacci {

	public static void main(String[] args) {
		
		int x1=0,y1=1,summ=0;
		
		for(int i=0;i<=5;i++) {
			//System.out.println(summ);		
			summ=x1+y1;
			x1=y1;
			y1=summ;
			
		}
		
		int first = 0;
		int second = 1;
		int sum = 0;
		int i=1;
		while(5>=i) {
			System.out.println(sum);
			sum=first+second;
			first = second;
			second = sum;
			i++;
		}
		

	}

}
