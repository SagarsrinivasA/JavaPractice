package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilityClassesPractice {

	public static void main(String[] args) {
		// DFNS :: Default Natural Sorting 
		ArrayList l1 = new ArrayList();
		l1.add("B");
		l1.add("Z");
		l1.add("K");
		l1.add("L");
		l1.add("D");
		
		System.out.println("Cllection before Sorting"+l1);
		//l1.add(new Integer(10));  // ClassCastException
		//l1.add(null);// NPE
		
		//Collections.sort(l1);  // DFNS
		Collections.sort(l1, new MySortingComparator());
		System.out.println("Cllection after Sorting"+l1);
		
	}

}

class MySortingComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		return -s2.compareTo(s1);
	}
	
}
