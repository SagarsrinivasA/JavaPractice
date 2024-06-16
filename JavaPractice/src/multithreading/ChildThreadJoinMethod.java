package multithreading;

public class ChildThreadJoinMethod {

	public static void main(String[] args) throws InterruptedException {

		// Thread.currentThread().join(); // main thread is calling join method on
		// mainThread:: deadLoak condition

		MyChildThread.mt = Thread.currentThread();

		MyChildThread ct = new MyChildThread();
		ct.start();
		// ct.join(); // dead lock situation
		for (int i = 0; i < 4; i++) {

			System.out.println("main thread");
			Thread.sleep(2000);
		}

	}

}

class MyChildThread extends Thread {

	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Child Thread calling join method");
		}
	}
}
