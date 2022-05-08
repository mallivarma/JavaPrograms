package com.pailee.practice;

class Driver4{
    
    int calculate(int a, int b)
    {
        try{
            return a-b;
        }catch(Exception e){
            return a+b;
        }finally{
            return a*b;
        }
    }        
} 


public class InterviewBit4 {

	public static void main(String[] args) {
		Driver4 obj1 = new Driver4();
        int result = obj1.calculate(2, 3);
        System.out.println("Result: " + result);
		

	}

}
