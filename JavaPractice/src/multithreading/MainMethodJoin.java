package multithreading;

public class MainMethodJoin {

	public static void main(String[] args) throws InterruptedException {
		
		MyMainThread t = new MyMainThread();
		Thread t1 = new Thread(t);
		t1.start();
		
		t1.join();
		for(int i = 0; i<3; i++) {
			System.out.println("rama thread");
		}
		
	}

}

class MyMainThread implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0; i<3; i++) {
			System.out.println("seeta thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
		}
	}
	
}
