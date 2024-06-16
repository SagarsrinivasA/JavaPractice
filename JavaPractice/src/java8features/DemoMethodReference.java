package java8features;

public class DemoMethodReference {

	// public static void m1() {
	public void m1() {
		for (int i = 0; i < 5; i++) {
			//System.out.println("Child thread-2");
		}
	}

	public static void main(String[] args) {

		/*
		 * Runnable r = () -> { for(int i = 0; i < 5; i++) {
		 * System.out.println("Child thread"); } };
		 */

		// By Method reference

		// Runnable r = DemoMethodReference::m1;

		// if it is not static method
		DemoMethodReference t1 = new DemoMethodReference();
		Runnable r = t1::m1;
		Thread t = new Thread(r);
		t.start();
		// child thread created
		for (int i = 0; i < 5; i++) {
			//System.out.println("main thread");
		}
		
		// sum by lambda expression
		Test t2 = (a,b) -> System.out.println("The Sum :"+ (a+b));
		t2.add(20, 30);
		
		// sum by Method reference		
		Test t3 = Test2 :: sum;
		t3.add(200, 300);
		
		
	}

}

interface Test{
	public void add(int a, int b);
}

class Test2{
	
	public static void sum(int x, int y) {
		System.out.println("The Sum: "+ (x+y));
	}
}
