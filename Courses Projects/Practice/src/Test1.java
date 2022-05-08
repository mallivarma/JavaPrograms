import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

class Person{
	
	int age;
	String name;
	
	
	
	public Person(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class Test1 {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Mallesh",34));
		persons.add(new Person("Suresh",54));
		persons.add(new Person("Chandra",45));
		persons.add(new Person("Mallesh",56));
		persons.add(new Person("Sury",67));
		persons.add(new Person("Sury",25));
		
		//System.out.println(persons);
		
		Map<String,List<Integer>> hsMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();
	
		
		for(Person p :persons) {
			//list.add(p.getAge());
			if(!hsMap.containsKey(p.getName())) {
				hsMap.put(p.getName(), new ArrayList<Integer>());
			}
			
			hsMap.get(p.getName()).add(p.getAge());
		}
		System.out.println(hsMap);
		
	}

}
