package multithreading;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		
		MySynchThread st1 = new MySynchThread(d1, "dhoni");
		MySynchThread st2 = new MySynchThread(d2, "kohli");
		
		st1.start();
		st2.start();
		
		/*MySynchThread st1 = new MySynchThread(d, "dhoni");
		MySynchThread st2 = new MySynchThread(d, "kohli");
		MySynchThread st3 = new MySynchThread(d, "jadeja");
		MySynchThread st4 = new MySynchThread(d, "faf");

		st1.start();
		st2.start();
		st3.start();
		st4.start();*/
		//System.out.println("End of main thread");

	}

}

class Display {

	public synchronized void wish(String name) {   
	//public void wish(String name) {

		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		; // 1lack lines code
		//synchronized (Display.class)                  // current object level lock
		//synchronized (Display.class) {                  // class level lock          // synchronized block code demo
			for (int i = 0; i < 1; i++) {
				System.out.print("Good Morning :");

				try {
					Thread.sleep(2000);
					System.out.println(name);
				} catch (InterruptedException e) {
				}

			}
		//}
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		; // 1lack lines code
	}
}

class MySynchThread extends Thread {

	Display d;
	String name;

	public MySynchThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}