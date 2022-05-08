package com.pailee.practice.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		

		Employee emp = new Employee();
		emp.setAge(35);;
		emp.setName("Mallesh");
		emp.setDept("IT");
		
		Employee emp1 = new Employee();
		emp1.setAge(25);;
		emp1.setName("Saanvi");
		emp1.setDept("HR");
		
		Employee emp2 = new Employee();
		emp2.setAge(24);;
		emp2.setName("Nidhi");
		emp2.setDept("FINANCE");
		
		Employee emp3 = new Employee();
		emp3.setAge(28);;
		emp3.setName("Sandhya");
		emp3.setDept("MEDICAL");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
		//To find how many list values.
		
		Map<String,Long> count = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(count);
		 
		//List based on dept;IntSummaryStatistics
		//Remember always group by operations returns a Map with the actual key and aggregated result as value.
		
		Map<String, Integer> ll = list.stream().collect(Collectors.groupingBy(Employee::getName,
				Collectors.summingInt(Employee::getAge)));
		
	    System.out.println("Summing Int "+ll);
		
	    Map<String, Map<Integer, Long>> lll = list.stream().collect(Collectors.groupingBy(Employee::getName,
	    		Collectors.groupingBy(e->e.getAge(),Collectors.counting())));
	   
	    System.out.println("Multiple properties  "+lll);

	}

}
