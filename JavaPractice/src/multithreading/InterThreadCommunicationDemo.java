package multithreading;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {

		InterThread it = new InterThread();
		it.start();
		// Thread.sleep(0,1);
		// it.join();
		Thread.sleep(1000);  // if we give chance to child thread to execute .. then main thread has to wait forever
		//synchronized (it) {
			System.out.println("main thread trying to call wait mathod");
			//it.wait();
			it.wait(2000);  // to overcome the main thread sleeping by specifing time for wait method
			System.out.println("Main thread got notification");
			System.out.println(it.total);

		//}

	}

}

class InterThread extends Thread {

	public int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread start calculation");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
		// to apply join method, if there is so many lines after for loop then we need
		// to wait till complete all lines of run method
	}
}