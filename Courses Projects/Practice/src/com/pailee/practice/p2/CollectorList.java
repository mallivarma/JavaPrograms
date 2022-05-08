package com.pailee.practice.p2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorList {

	public static void main(String[] args) {
		

		//Suppose if we want get the list of top 3 employees salary giving by Name then we do like this using objects.
		
				List<Employee> employees = new ArrayList<>();//getAllEmployess();
				employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3)
				.map(Employee::getName)// also we can do .map(emp->emp.getName())
				.forEach(System.out::println);
				 
				//and also more elagant way
				List<String> empList = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				//.filter(employee -> isActive(employee))//It find active or not
				.limit(3)
				.map(Employee::getName)
				.collect(Collectors.toList());
				
				//If it is set then
				
				//Set<String> setOfEmps = .Collectors(Collectors.toSet());
				
				//If it is map then
				//Map<String,Employee> empMap=
				//		emplyees.stream().limit(3).collect(Collectors.toMap(e->e.name,e->e));
				
				//if use delimiter to strings ,
				
				String names = employees.stream().limit(3)
						.map(Employee::getName)
						.collect(Collectors.joining(","));
				
				//group by dept
				Map<String,List<Employee>> listEmp = employees.stream()
						.collect(Collectors.groupingBy(e->e.dept));
						
				//count employess in each dept
				Map<String,Long> deptCounts = employees.stream()
						.collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
				//When we can use parallel stream.
				
				Map<String,List<Employee>> empDept = employees.stream()
						.parallel()
						.collect(Collectors.groupingBy(e->e.dept));//Only when more than 10000 elements.
				
				Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
		         
		        List<Integer> newList = evenNumInfiniteStream.limit(10)
		                                            .collect(Collectors.toList());
		        System.out.println(newList);
		        
		        
		        
			
	}

}
