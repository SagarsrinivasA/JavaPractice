package mappractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PracticeMap {

	public static void main(String[] args) {
		// Map interface: Collection of Entry
		// Entry: key-value pair

		HashMap<String, Integer> h1 = new HashMap<>();
		h1.put("sagar", 7);
		h1.put("sahana", 26);
		h1.put("anantha", 28);
		h1.put("kumari", 30);

		System.out.println(h1);

		h1.put("sagar", 73);
		System.out.println(h1);

		Set<String> s1 = h1.keySet();
		System.out.println(s1);

		Collection c1 = h1.values();
		System.out.println(c1);

		Set s2 = h1.entrySet();
		System.out.println(s2);

		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + " " + m1.getValue());
			if(m1.getKey().equals("sagar")) {
				m1.setValue(7398);
			}
		}
		System.out.println(s2);

	}

}
