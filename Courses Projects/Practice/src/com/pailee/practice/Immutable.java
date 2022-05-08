package com.pailee.practice;

public final class Immutable {

	private final Integer im1;
	
	private final  String im2;
	
	private final  Date im3;
	
   public Immutable(Integer a, String b, Date c) {
		this.im1=a;
		this.im2=b;
		this.im3=c;
	}

   public static Immutable getInstane(Integer a,String b,Date c) {
		
		
		return new Immutable(a,b,c);
	
	}

	public Integer getIm1() {
		return im1;
	}
	public String getIm2() {
		return im2;
	}

	public Date getIm3() {
		return im3;
	}

	//Only getter methods not setter methods.
	
	
}
