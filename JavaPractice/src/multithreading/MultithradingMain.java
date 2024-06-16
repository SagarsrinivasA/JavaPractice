package multithreading;

public class MultithradingMain {

	public static void main(String[] args) {
		
		// java has default main thread to execute program
		// creating new thread object by using main thread
		
		//MultiThreadingDemo mt = new MultiThreadingDemo();    // Instantiating new thread by main thread
		//mt.start();                                        // Starting of new thread
		//mt.run(9);
		/*mt.run();                                            // main thread executes no new thread created.. if we call directly run method  
		for(int i = 0; i<9; i++) {
			System.out.println("Main Thread");            // this task executed by Main Thread
		}*/
		
		RunnableInterfaceDemo rt = new RunnableInterfaceDemo();
		Thread t2 = new Thread(rt);
		t2.start();
		
		for(int i=0; i<=3; i++) {
			System.out.println("main Thread");
		}
		
	}

}
