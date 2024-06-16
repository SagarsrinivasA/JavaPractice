package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSerchDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Z");
		al.add("K");
		al.add("L");
		al.add("A");
		al.add("M");
		al.add("a");
		
		System.out.println("print list with insertion order "+ al);
		// sort the list 
		Collections.sort(al);
		System.out.println("print list after sorting"+al);
		// now use binary Serach method to find the elements.
		// condition.. to apply binary method list should be sorted
		System.out.println(Collections.binarySearch(al, "K"));   // successful search return index
		System.out.println(Collections.binarySearch(al, "C"));   // unsuccessful search return insertion order 
	}

}
