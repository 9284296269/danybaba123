package methods;

public class NonStaticMethods {
	public void demo() {
		System.out.println("demo is non static method");
		
	}
	public static void main(String[] args) {
		NonStaticMethods obj= new NonStaticMethods();
		obj.demo();
	}

}
