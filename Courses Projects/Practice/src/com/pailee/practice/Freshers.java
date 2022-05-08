package com.pailee.practice;


class A{
	public void methodA(){
	System.out.println("Class A");
	   }
	}
class B extends A{
	public void methodA(){
	System.out.println("Class B");
	}
	}
	
public class Freshers {
	
	static int a=10;
	public static void main(String[] args) {
		A b = new B();
		b.methodA();
		//B c  = (B) new A();compile time error
		//c.methodA();
		
		System.out.println("HHHH"+a);
		//System.out.println("BBb"+b);
		
		int a[] = {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("Array"+a[i]);
			sum=sum+a[i];
			System.out.println("Array  SUM"+sum);
			
		}
		

		String s1 = "Mallesh";
		String s2 = new String("Mallesh");
		System.out.println(s1.equals(s2));
		
	}
}