package com.pailee.practice;

public class InterviewBit1 {

	  public   void method1 (int num1,float num2){
	         System.out.println("int-float method");
	    }
	    public void method1(float num1,int num2){
	         System.out.println("float-int method");
	    }
	     public static void main(String[] args){
	    	 
	           InterviewBit1 interviewBit= new InterviewBit1();
	           interviewBit.method1(1, 10f);
	     }
}
