package collectionpractice;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		/*
		 * Integer i1 = (Integer) arg0; Integer i2 = (Integer) arg1;
		 */
		/*
		 * if (i1 < i2) { return +1; } else if (i1 > i2) { return -1;
		 * 
		 * } else { return 0; }
		 */
		// return i1.compareTo(i2);
		// return -i1.compareTo(i2);
		// return i2.compareTo(i1);
		// return -i2.compareTo(i1);
		// return -100;
		// return +1;
		// return 0;

		// for string object comparison
		/*String s1 = arg0.toString();
		String s2 = arg1.toString();

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 < l2) {
			return -1;
		} else if (l1 > l2) {
			return +122;
		} else {
			return s1.compareTo(s2);
		}*/
		
		// user comparator implementation
		
		Employee e1 = (Employee)arg0;
		Employee e2 = (Employee)arg1;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}

}
