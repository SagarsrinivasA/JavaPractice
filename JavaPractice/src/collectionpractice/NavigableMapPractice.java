package collectionpractice;

import java.util.TreeMap;

public class NavigableMapPractice {

	public static void main(String[] args) {
		TreeMap<String, String> m1 = new TreeMap<String, String>();
		m1.put("B", "BasketBall");
		m1.put("C", "Cricket");
		m1.put("P", "PollWault");
		m1.put("K", "Kabbadi");
		m1.put("A", "Athletics");
		
		System.out.println(m1);
		System.out.println(m1.ceilingKey("E")); // K
		System.out.println(m1.floorKey("G"));   // C
		System.out.println(m1.lowerKey("P"));   //K
		System.out.println(m1.higherKey("X"));  // null
		System.out.println(m1.pollFirstEntry());  //A
		System.out.println(m1.pollLastEntry());  // P
		System.out.println(m1.descendingMap());  //K,C,B
		System.out.println(m1);      // B,C,K
		
	}

}
