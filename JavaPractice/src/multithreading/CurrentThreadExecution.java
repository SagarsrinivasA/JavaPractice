package multithreading;

public class CurrentThreadExecution {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		System.out.println("main method executed by Thread:"+ Thread.currentThread().getName());
	}

}
