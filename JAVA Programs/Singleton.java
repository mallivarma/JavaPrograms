
public class Singleton {

	
	private static Singleton obj= null;
	
	private Singleton() {
		
		
		
	}
	
	public  static Singleton getInstance() {
		
		if(obj == null) {
			obj= new Singleton();
		}
		
		return obj;
		
	}
	
	public synchronized void show() {
		System.out.println("HII"+obj.toString());
	}
	
}
