package multithreading;

public class RunnableInterfaceDemo implements Runnable {
	
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Child Thread");
		}
	}

}
