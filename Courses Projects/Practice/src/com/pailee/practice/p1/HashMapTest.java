package com.pailee.practice.p1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		

		Map<String,String> map = new HashMap<>();
		map.put(null, null);
		map.put(null, null);
		map.put("Hi", "1");
		map.put("Hi", null);
		map.put("Hello", null);
		map.put("Hello", "Hello");
		
		System.out.println(map);
		
		
		Map<String,String> hsMap = new Hashtable<>();
		//hsMap.put(null, null);//Null pointer Exception
		//hsMap.put(null, null);//It doesn not allow null keys and values.
		//hsMap.put("Hi", null);
		hsMap.put("Hi", "1");
		hsMap.put("Hi", "2");
		System.out.println(hsMap);

	}

}
