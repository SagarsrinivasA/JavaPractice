package collectionpractice;

import java.util.WeakHashMap;

public class WeakHashMapPractice {

	public static void main(String[] args) throws InterruptedException {

		// HashMap > Garbage Collector > WeakHashMap
		//HashMap m1 = new HashMap();                  
		WeakHashMap m1 = new WeakHashMap();
		Temp t = new Temp();
		m1.put(t, "sagar");
		System.out.println(m1);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m1);
	}

}

class Temp{
	
	public String toString() {
		return "temp";
	}
	
	public final void finalize() {
		System.out.println("print when GC activates");
	}
}
