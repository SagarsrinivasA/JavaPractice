package multithreading;

public class ThreadPriorities {

	public static void main(String[] args) {
		// default main Thread priority
		System.out.println(Thread.currentThread().getPriority()); // 5
		// set priority of main Thread
		// Thread.currentThread().setPriority(19); // R.E: IllegalArgumentException

		Thread.currentThread().setPriority(7); // once we comment this line child thread will get priority as default
												// main thread
		// i.e 5
		MyThread t = new MyThread();
		// if we set child Thread priority as 10
		t.setPriority(10);
		t.start();
		//System.out.println(t.getPriority());
		for(int i=0; i<= 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
