package collectionpractice;

import java.util.TreeMap;

public class TreeMapPractice {

	public static void main(String[] args) {
		// Default natural sorting order
		TreeMap t1 = new TreeMap();
		t1.put(101, "sagar");
		t1.put(112, 119);
		t1.put(120, "sahana");
		//t1.put("king", 900);   //// ClassCastException we get 
		//t1.put(null, 110);       // null pointer exception we get
		System.out.println(t1);
		
		TreeMap t2 = new TreeMap(new myTreeComparator());
		t2.put("SS", 7);
		t2.put("S", 26);
		t2.put("A", 28);
		t2.put("K", 30);
		
		System.out.println(t2);

	}

}
