import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingletonDemo {

	public static void main(String[] args) {
		

		Singleton demo = Singleton.getInstance();
		
		demo.show();
		demo.toString();
		
		Singleton demo1 = Singleton.getInstance();
		
		demo1.show();
		
		List<Integer> str = Arrays.asList(10,10,20,40);
		List<Integer> str1 = str.stream().distinct().collect(Collectors.toList());
		System.out.println(str1);
		
		
		
	}

}
