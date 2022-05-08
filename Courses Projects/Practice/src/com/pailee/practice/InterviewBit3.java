package com.pailee.practice;

class Driver1{
    public int num1;
    static int num2;
    
    void calculate(int a, int b)
    {
        num1 +=  a ;
        num2 +=  b;
    }        
} 


public class InterviewBit3 {

	public static void main(String args[])
    {
		Driver1 obj1 = new Driver1();
		Driver1 obj2 = new Driver1();   
        obj1.num1 = 0;
        obj1.num2 = 0;
        obj1.calculate(1, 2);
        obj2.num1 = 0;
        obj2.calculate(2, 3);
        System.out.println(obj1.num1 + " " + obj2.num2);     
    }
	
}
