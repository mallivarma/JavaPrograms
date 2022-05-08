package com.pailee.practice;

class Driver{
	
     int fun(int n) 
    {
        int result;
        result = fun (n - 1);
        return result;
    }
} 
class InterviewBit2{
	
    public static void main(String args[]) 
    {
    	Driver ib = new Driver() ;
        System.out.print(ib.fun(12));
    }//Statck over flow error//compile time error
}
