import java.util.ArrayList;
import java.util.List;

public class DigitsFound {

	public static void main(String[] args) {
		

		int n = -110;
		
		int t=0;
		
		List<Integer> tt =new ArrayList<>();
		
 		int n1= Math.abs(n);
			
		while(n1>0) {
			t=n1%10;//0
			n1=n1/10;//
			tt.add(t);
		}
		
		System.out.println(tt.size());
		
		int a = 1234560;
		
		List<Integer> ll = new ArrayList<>();
		while(a>0) {
			a=a/10;
			
			ll.add(a);
		}
		System.out.println("Now you see "+ll.size());
		

	}

}
