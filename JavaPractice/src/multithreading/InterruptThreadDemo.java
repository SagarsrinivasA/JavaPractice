package multithreading;

public class InterruptThreadDemo {

	public static void main(String[] args) {
		
		MyInterruptThread it = new MyInterruptThread();
		it.start();
		it.interrupt();
		System.out.println("End of main thread");
		
	}

}

class MyInterruptThread extends Thread {
	
	public void run() {
		for(int i =0; i<1000; i++) {
			System.out.println("I am lazy thread"+i);
			
		}
		System.out.println("I want to sleep");
	
	try {
		Thread.sleep(3000);
		
	}catch(InterruptedException e) {
		System.out.println("i got interrupted");
	}
	
}
}