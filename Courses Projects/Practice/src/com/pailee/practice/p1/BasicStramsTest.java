package com.pailee.practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStramsTest {

	public static void main(String[] args) {
		

		List<Dish> vegetarianDishes = new ArrayList<>();
		List<Dish> menu = new ArrayList<>(); 
		for(Dish d: menu){
		    if(d.isVegetarian()){
		        vegetarianDishes.add(d);
		    }
		}
		//using streams.
		
		List<Dish> listsDish = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream()
		       .filter(i -> i % 2 == 0)
		       .distinct()
		       .forEach(System.out::println);
		
		List<Dish> dishes = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());
		
		List<String> dishNames = menu.stream()
                .map(emp->emp.getName()) //and also .map(Dish::getName)
                .collect(Collectors.toList());
		
		String[] arrayOfWords = {"Goodbye", "World"};
		Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
		System.out.println(streamOfwords);
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares =
		    numbers1.stream()
		           .map(n -> n * n)
		           .collect(Collectors.toList());
		System.out.println(squares);
		
		boolean isHealthy = menu.stream()
                .allMatch(d -> d.getCalories() < 1000);
		
		List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
		
		Optional<Integer> firstSquareDivisibleByThree =
		  someNumbers.stream()
		             .map(x -> x * x)
		             .filter(x -> x % 3 == 0)
		             .findFirst();//9
		
		//suppose ex.
		
		int sum = 0;
		for (int x : numbers) {
		    sum += x;
		}
		
		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		
		//System.out.println("Sum Reduce "+sum1);
		
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		
		List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
		
		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		List<Integer> wordLengths = words.stream()
		                                 .map(String::length)
		                                 .collect(Collectors.toList());
		
		System.out.println("wordLengths **"+wordLengths);
		
		
		Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
		stream.map(String::toUpperCase).forEach(System.out::println);
		
		Stream.iterate(0, n -> n + 2)
	      .limit(10)
	      .forEach(System.out::println);
		//Febonacci series.
		
		Stream.iterate(new int[]{0, 1},
	               t -> new int[]{t[1], t[0]+t[1]})
	      .limit(20)
	      .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
		/*
		final Collection<Employee> employees = List.of(
                new Employee("Karen Smith", 51200.0, 29, Employee.Sex.FEMALE),
                new Employee("John Smith", 24000.0, 32, Employee.Sex.MALE),
                new Employee("Anthony Jackson", 44000.0, 33, Employee.Sex.MALE),
                new Employee("Alyson Palmer", 34320.0, 36, Employee.Sex.FEMALE),
                new Employee("Jessica Sanders", 64320.0, 34, Employee.Sex.FEMALE)
        );

        final Map<Employee.Sex, List<Employee>> employeesBySex = employees.stream()
                .collect(groupingBy(Employee::getSex));

        System.out.println(employeesBySex);
        
        //Grouping by key specifying a different collector
        
        final Map<Employee.Sex, Set<Employee>> employeesBySex = employees.stream()
                .collect(groupingBy(Employee::getSex, toSet()));        
		
		final Map<Employee.Sex, Double> averageAgeBySex = employees.stream()
                .collect(groupingBy(Employee::getSex, averagingInt(Employee::getAge)));
		
		//group by a secondary field!
		 
		final Map<Employee.Sex, Map<Integer, List<Employee>>> groupBySexAndAge = employees.stream()
                .collect(groupingBy(Employee::getSex, groupingBy(Employee::getAge)));
		//if we want to find the youngest employee in each age group
		 
		 
		 final Map<Employee.Sex, Optional<Employee>> youngestEmployeeBySex = employees.stream()
                .collect(groupingBy(Employee::getSex, minBy(comparing(Employee::getAge))));
		// We could even filter some employees based on a condition after they’re grouped; for example, 
		 let’s get all the employees over thirty grouped by sex:
		 
		final Map<Employee.Sex, List<Employee>> employeesOverThirtyBySex = employees.stream()
                .collect(groupingBy(Employee::getSex, filtering(employee –> employee.getAge() > 30, toList())));
               
           
                
		
		*/
		
		
		
		List<Integer> list1 = Arrays.asList(0, 3, 5, 7, 1, 4, 9, 1, 6, 2, 8);
		
		
		
		
		
		
	}

}
