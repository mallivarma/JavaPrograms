package com.pailee.practice.p1;

import java.util.Optional;

public class NullCheck {

	public static void main(String[] args) {
		
		
		String text = null;
		
		// Using Optional
		Optional<String> textOptional = Optional.ofNullable(text);
		if("hello".equals(textOptional.orElse(null))) {
		 System.out.println("hello");
	    }
				

	}

}
