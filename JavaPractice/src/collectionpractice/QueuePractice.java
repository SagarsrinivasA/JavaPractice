package collectionpractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {

		PriorityQueue q1 = new PriorityQueue();
		/*
		 * System.out.println(q1.peek()); System.out.println(q1.remove());
		 */

		for (int i = 0; i <= 10; i++) {
			q1.add(i);
		}

		/*
		 * System.out.println(q1); System.out.println(q1.poll());
		 * System.out.println(q1);
		 */ // output is not in DNSO is because platform won't provide proper support

		// for Customized sorting

		PriorityQueue q2 = new PriorityQueue(15, new MyQueueComparator());
		q2.offer("A");
		q2.offer("Z");
		q2.offer("B");
		q2.offer("L");

		System.out.println(q2);
	}

}

class MyQueueComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = (String) o1;
		String s2 = o2.toString();

		return s2.compareTo(s1);
	}

}
