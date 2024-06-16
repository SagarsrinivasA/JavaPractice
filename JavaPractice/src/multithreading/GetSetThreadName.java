package multithreading;

public class GetSetThreadName {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());    //main
		MyThread t = new MyThread();
		System.out.println(t.getName());
		
		// to set name of a Thread
		
		Thread.currentThread().setName("sagar");
		System.out.println(Thread.currentThread().getName());
		t.setName("srinivas");
		System.out.println(t.getName());
		
		System.out.println(10/0);
	}

}

class MyThread extends Thread{
	
	public void run() {
		//System.out.println("run method executed by Thread:"+ Thread.currentThread().getName());
		for(int i =0; i<=3;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
