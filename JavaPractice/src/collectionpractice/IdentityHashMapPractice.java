package collectionpractice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapPractice {

	public static void main(String[] args) {
		// HashMap uses .equals method to compare duplicate keys.

		HashMap m1 = new HashMap();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		m1.put(i1, "sagar");
		m1.put(i2, "sahana");

		System.out.println(m1);

		// IdentityHashMap uses == operator for compare duplicate keys

		IdentityHashMap m2 = new IdentityHashMap();

		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);

		m2.put(i3, "anantha");
		m2.put(i4, "kumari");
		System.out.println(m2);
	}

}
