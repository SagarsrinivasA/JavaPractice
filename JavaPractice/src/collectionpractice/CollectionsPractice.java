package collectionpractice;

import java.text.DecimalFormat;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {
		/*Vector<Integer> v1 = new Vector<Integer>();
		v1.add(100);
		System.out.println(v1);
		
		Hashtable<String, Integer> h1 = new Hashtable<String, Integer>();*/
		
		DecimalFormat df= new DecimalFormat("#,##0.00");
		
//		System.out.println(df.format(.65));
		
		/*TreeSet<Integer> t2 = new TreeSet<Integer>(new MyComparator());
		t2.add(10);
		t2.add(0);
		t2.add(15);
		t2.add(20);
		t2.add(20);
		System.out.println(t2);*/
		
		//TreeSet s2 = new TreeSet(new MyComparator());
		/*s2.add("sagar");
		s2.add("adarsh");
		s2.add("puneeth");
		s2.add("jalendra");
		s2.add("arjun");
		s2.add("adarsh ravindra");*/
		
	// StringBuffer example : we know StringBuffer class did not implements Comparable Class i.e why we need to choose Comparator class.
		
	    /*s2.add(new StringBuffer("A"));
	    s2.add(new StringBuffer("Z"));
	    s2.add(new StringBuffer("L"));
	    s2.add(new StringBuffer("Z"));
	    s2.add(new StringBuffer("M"));*/
		
	// comparing String and StringBuffer objects with increasing order of length. if length are equal then alphabetical order should be consider.
		/*s2.add("A");
		s2.add(new StringBuffer("A"));
		s2.add("AA");
		s2.add("L");
		s2.add(new StringBuffer("XX"));
		s2.add("ABC");
		s2.add("ABCD");
		System.out.println(s2);*/
		
		// Implementing Comparable and Comparator for our own class.
		
		Employee e1 = new Employee("sagar", 120);
		Employee e2 = new Employee("sahana", 101);
		Employee e3 = new Employee("kumari", 108);
		Employee e4 = new Employee("anantha", 110);
		
		//TreeSet t3 = new TreeSet();    comparable 
		TreeSet t3 = new TreeSet(new MyComparator());
		t3.add(e1);
		t3.add(e2);
		t3.add(e3);
		t3.add(e4);
		System.out.println(t3);
		
		
	
	}

}
