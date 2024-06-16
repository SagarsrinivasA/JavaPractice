package multithreading;

public class MultiThreadingDemo extends Thread {

	public void run() {
		System.out.println("no-arg run method");
		/*for (int i = 0; i < 8; i++) {
			System.out.println("Child Thrad"); // this task executed by Child thread
		}*/
	}
	
	public void run(int i) {
		System.out.println("int-arg run method");
	}

}
