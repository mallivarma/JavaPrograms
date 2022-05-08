package com.pailee.practice;

public class ImmutableCheck {

	public static void main(String[] args) {
		
		Immutable im = Immutable.getInstane(100, "Mallesh", new Date());
		
		System.out.println(im.getIm1() + im.getIm2() + im.getIm3());
		
		tryModification(im.getIm1(),im.getIm2(),im.getIm3());
		
		System.out.println(im.getIm1() +im.getIm2() + im.getIm3());

	}

	private static void tryModification(Integer im1, String im2, Date im3) {
		im1=200;
		im2="Varma";
		im3= new Date();
		
	}

}
