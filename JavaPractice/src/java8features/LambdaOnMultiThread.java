package java8features;

public class LambdaOnMultiThread {

	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 0; i<=5; i++) {
				System.out.println("child thread by lambda");
			}
		
		};
		
		Thread t = new Thread(r);
		t.start(); // child thread created and ii is responsible for execute run method
		for(int i = 0; i<=5; i++) {
			System.out.println("Main thread..");
		}

	}
		
	

}

/*class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i =0; i <= 5; i++) {
			System.out.println("Child thread..");
		}
		
	}*/
	
//}
