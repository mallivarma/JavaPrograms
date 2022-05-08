package com.pailee.practice.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Kroger {

	public static void main(String[] args) throws IOException {
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line;
	    
	    FirstDataSet set = new FirstDataSet();
	    while ((line = in.readLine()) != null) {
	      System.out.println(line);
	      set.setYear(Integer.valueOf(line));
	      set.setState(String.valueOf(line));
	      set.setMonth(String.valueOf(line));
	      set.setNumber(Integer.valueOf(line));
	      
	    }
	    System.out.println(set);
	  
	  }
	}


