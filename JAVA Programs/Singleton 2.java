package com.pailee.practice;

public class Singleton {

	private static Singleton signleInstance = new Singleton();
	
	private Singleton()
	{
		
	}
	
	public static synchronized Singleton getInstance() {
		
		if(null == signleInstance) {
		
			signleInstance = new Singleton();
		}
		
		return signleInstance;
		
		
	}
	public void show() {
		
		System.out.println("Show");
	}
}
