package prince;

public class Test2 {

	public static void main(String[] args) {
//		public class Main {
//		    public static void main(String[] args) {
		        Test2 myObject = new Test2();
		// A myObject = new MyClass();
		        // Call the default method from interface A
		        ((C) myObject).call();
		        // Call the default method from interface B
		        ((D) myObject).call();
//		    }
//		}
	}

}
