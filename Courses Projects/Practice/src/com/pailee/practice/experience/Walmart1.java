package com.pailee.practice.experience;

import java.util.HashMap;
import java.util.Map;

public class Walmart1 {

	public static void main(String[] args) {
		
			    String[] counts = {
			      "POINT,333858038",
			      "NOT,4522732626",
			      "INTO,1144226142",
			      "ON,4594521081",
			      "FOR,6545282031",
			      "NOW,679337516",
			      "ONE,2148983086",
			      "BEHAVIOR,104177552",
			      "WAITS,2911079",
			      "PEOPLE,658716166",
			      "HI,15453893",
			      "FORM,352032932",
			      "OF,30966074232",
			      "THROUGH,647091198`DDX         ",
			      "BETWEEN,744064796",
			      "FOUR,262968583",
			      "LEFT,306802162",
			      "OFF,302535533",
			      "FROM,3469207674",
			      "NO,1400645478",
			      "FORMS,136468034",
			      "A,45916054218"
			    };

			HashMap<String,String> countMap = new HashMap<>();

			  countMap =   get_list(counts, 15, 5,countMap);
			  System.out.println("Result "+countMap);
    }
			  

   static HashMap<String,String>  get_list(String[] counts,int maxReturn,int length,HashMap<String,String> countMap) {

			  //HashMap<String,String> countMap = new HashMap<>();
			  HashMap<String,String> returnMap = new HashMap<>();
			  int counter = 0;
			  for(String str : counts){
			  String[] st = str.split(",");
			  countMap.put(st[0],st[1]);
			  }
			   if(counter < maxReturn){
			     System.out.println("counter ha "+maxReturn);
			    for(Map.Entry<String,String> st : countMap.entrySet()){
			    if(st.getKey().length()<length){
			    returnMap.put(st.getKey(),st.getValue());
			    System.out.println("INSERERE"+returnMap);
			    counter++;
			    }
			    }
			    }

			    System.out.println("Counter"+counter);
			    return returnMap;
   			}

	}
