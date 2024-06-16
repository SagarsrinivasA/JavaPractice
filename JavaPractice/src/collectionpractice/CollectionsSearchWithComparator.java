package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchWithComparator {

	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		// add elements to the list

		li.add(15);
		li.add(20);
		li.add(5);
		li.add(0);
		li.add(7);

		System.out.println("print the integre list with insertion order" + li);

		// reverse the list
		Collections.reverse(li);
		// System.out.println("print revrsed list elements"+li);
		// sort the list with customizable sorting order

		Collections.sort(li, new MySearchComparator());

		System.out.println("print list afetr sorting " + li);

		// recerseOrder method reversed the order of comparator.

		Comparator l2 = Collections.reverseOrder(new MySearchComparator());
		System.out.println("print list with reversed order comparator");
		Collections.sort(li, l2);
		System.out.println(li);

		System.out.println(Collections.binarySearch(li, 15, l2));
		System.out.println(Collections.binarySearch(li, 17, l2));
		System.out.println(Collections.binarySearch(li, 2)); // Unpredictable.. if we are using customizable sorting..
		// comparator object must be passed

	}

}

class MySearchComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}

}
