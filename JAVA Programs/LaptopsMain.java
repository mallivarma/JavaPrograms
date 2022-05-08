package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop implements Comparable<Laptop>{
	
	private int gb;
	private int price;
	private String brand;
	

	@Override
	public int compareTo(Laptop o) {
		
		//when to swap
		if(this.getPrice()>o.getPrice()) {
			return 1;//Any number you can give like 100,200
		}else if(this.getPrice()<o.getPrice()){
			return -1;
		}else{
			return 0;
		}
		
	}
	
	
	public Laptop(int gb, int price, String brand) {
		super();
		this.gb = gb;
		this.price = price;
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Laptop [color=" + gb + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	public int getGb() {
		return gb;
	}
	public void setColor(int gb) {
		this.gb = gb;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


	
	
}

public class LaptopsMain {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();

		Laptop top1 = new Laptop(777,1200 , "Apple");
		Laptop top2 = new Laptop(512,400 , "HP");
		Laptop top3 = new Laptop(1024,600 , "Lenovo");
		laps.add(top1);
		laps.add(top2);
		laps.add(top3); //Collections.sort() then you can use integer,string but not object still use 
		//Collections.sort so we need to use Comparable
		//System.out.println("Now you need to get values \n"+laps);
		Collections.sort(laps);
		
		for(Laptop top:laps) {
			System.out.println("Using Comparable "+top);
		}
			
		//Sometimes you dont want to implements comparable or comparator then you need to write own method.
		
		
		Comparator<Laptop> com  = new Comparator<Laptop>() {

	
			public int compare(Laptop l1, Laptop l2) {
				
				if(l1.getBrand() == l2.getBrand())
					return 1;
				else if(l1.getBrand() != l2.getBrand())
					return -1;
				else
					return 0;	
			}
			
		
		};
	Collections.sort(laps,com);
		
		for(Laptop top:laps) {
			System.out.println("Using Comparator "+top);
		}
		
		
	}

}
