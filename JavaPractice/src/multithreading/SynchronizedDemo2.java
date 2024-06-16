package multithreading;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		DisplayDemo d = new DisplayDemo();
		MyThread1 mt1 = new MyThread1(d);
		MyThread2 mt2 = new MyThread2(d);

		// start the threads

		mt1.start();
		mt2.start();
	}

}

class DisplayDemo {

	public synchronized void displayn() {
		for (int i = 1; i <= 3; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}

	public synchronized void displayc() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}

	}
}

class MyThread1 extends Thread {
	DisplayDemo d;

	public MyThread1(DisplayDemo d) {
		super();
		this.d = d;
	}

	public void run() {
		d.displayn();
	}
}

class MyThread2 extends Thread {
	DisplayDemo d;

	public MyThread2(DisplayDemo d) {
		super();
		this.d = d;
	}

	public void run() {
		d.displayc();
	}
}
