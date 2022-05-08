package com.pailee.practice;

interface Hello {
	int ab = 10;
	void methodA();
}
public class Demo implements  Hello{
	   static int  ab = 20;
	public static void main(String[] args) {
		System.out.println(ab);
		}

	@Override
	public void methodA() {
		
		
	}
}
