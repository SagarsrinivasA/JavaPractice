package multithreading;

public class ThreadSleepDemo {

	public static void main(String[] args) {

		MySleepThread st = new MySleepThread();
		st.start();
		st.interrupt();
		System.out.println("End of main thread");

	}

}

class MySleepThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}

	}
}
