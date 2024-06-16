package collectionpractice;

import java.util.Comparator;

public class myTreeComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		
		return -s2.compareTo(s1);
	}

}
