package collectionpractice;

import java.util.TreeSet;

public class NavigableSetPractice {

	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(1000);
		t1.add(2000);
		t1.add(3000);
		t1.add(4000);
		t1.add(5000);
		
		System.out.println(t1);
		System.out.println(t1.floor(2000)); //2000
		System.out.println(t1.lower(3500));  // 3000
		System.out.println(t1.ceiling(3500)); // 4000
		System.out.println(t1.higher(4500)); // 5000
		System.out.println(t1.pollFirst());  // removes 1000
		System.out.println(t1.pollLast());   // removes 5000
		System.out.println(t1.descendingSet());  // [4000, 3000, 2000]
		System.out.println(t1);    // [2000, 3000, 4000]
		
	}

}
