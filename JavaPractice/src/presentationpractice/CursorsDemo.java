package presentationpractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		// Enumerator 1.0v , Iterator 1.2v, ListIterator 1.2v
		// Enumerator to get objects one by one from old collection objects(legacy
		// class)
		// to create Enumeration object use elements() method
		// Enumeration has two methods
		// 1. hasMoreElements()
		// 2. nextElement()

		Vector v2 = new Vector();

		for (int i = 0; i <= 5; i++) {
			v2.add(i);
		}
		// System.out.println(v2);

		Enumeration e1 = v2.elements();

		while (e1.hasMoreElements()) {

			Integer i1 = (Integer) e1.nextElement();

			if (i1 % 2 == 0) {
				// System.out.println(i1);
			}

		}

		ListIterator lt = v2.listIterator();

		while (lt.hasNext()) {

			Integer i2 = (Integer) lt.next();

			if (i2 % 2 == 0) {
				// System.out.println(i2);
			} else {
				lt.remove();
			}

		}
		// System.out.println(v2);

		ArrayList<String> ld = new ArrayList<>();
		ld.add("basketball");
		ld.add("cricket");
		ld.add("football");
		ld.add("volleyball");

		System.out.println(ld);

		ListIterator<String> ltr = ld.listIterator();

		while (ltr.hasNext()) {
			String s1 = ltr.next();

			if (s1.equals("cricket")) {
				ltr.set("Athletics");
			} else if (s1.equals("football")) {
				ltr.remove();
			} else if (s1.equals("basketball")) {
				ltr.add("throwball");
			}
		}

		System.out.println(ld);

		while (ltr.hasPrevious()) {
			String s2 = ltr.previous();
			System.out.println(s2);
		}

	}

}
