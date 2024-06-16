package presentationdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {

		// Set: duplicates not allowed , insertion order not preserved

		HashSet<String> ht = new HashSet<>();
		ht.add("sagar");
		ht.add("ankit");
		ht.add("vidya");
		ht.add("kaptan");
		ht.add("vidya");
		//System.out.println(ht);

		Person p1 = new Person(101, "sagar", "srinivas");
		Person p2 = new Person(100, "ankit", "srinivas");
		Person p3 = new Person(107, "ram", "srinivas");
		Person p4 = new Person(106, "vidya", "srinivas");
		Person p5 = new Person(102, "kaptan", "srinivas");

		HashSet<Person> ht2 = new HashSet<>();
		ht2.add(p1);
		ht2.add(p2);
		//System.out.println(ht2);

		// LinkedHashSet

		// sorted set
		// {100, 102 , 103 , 104 , 106, 107}

		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(10);
		t1.add(17);
		t1.add(14);
		t1.add(7);
		t1.add(17);
		//System.out.println(t1);

		TreeSet<Person> t4 = new TreeSet<>(Comparator.comparing(Person:: getFirstName));
		t4.add(p1);
		t4.add(p2);
		t4.add(p3);
		t4.add(p4);
		t4.add(p5);
		System.out.println(t4);

		TreeSet<StringBuffer> st = new TreeSet<>(new MyComparator());

		st.add(new StringBuffer("D"));
		st.add(new StringBuffer("H"));
		st.add(new StringBuffer("A"));
		//System.out.println(st);

		InterfaceExample ex = new ElementClass();

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();

		return s2.compareTo(s1);

	}

}
