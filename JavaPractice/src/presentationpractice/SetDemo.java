package presentationpractice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet ht = new HashSet();
		// initial capacity = 16 and fill ratio/ load factor = 0.75
		
		ht.add(100);
		ht.add("hays");
		ht.add(null);
		ht.add(100);
		//System.out.println(ht);
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(115);
		t1.add(101);
		t1.add(103);
		t1.add(104);
		t1.add(107);
		t1.add(100);
		//System.out.println(t1);
		
		Customer c1 = new Customer(100, "sagar");
		Customer c2 = new Customer(120, "hays");
		Customer c3 = new Customer(140, "basketball");
		Customer c4 = new Customer(134, "gym");
		
		TreeSet<Customer> t3 = new TreeSet<>(new MyCustomerComparator());
		t3.add(c4);
		t3.add(c2);
		t3.add(c1);
		t3.add(c3);
		System.out.println(t3);
		
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
//		if(i1 < i2) {
//			return +1;
//		}else if(i1 > i2) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		return i2.compareTo(i1);
		
		/*Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;
		
		Integer s1 = c1.value;
		Integer s2 = c2.value;
		
		return s2.compareTo(s1);*/
	}
	
	 
}

class MyCustomerComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;
		
		String s1 = c1.name;
		String s2 = c2.name;
		
		return -s2.compareTo(s1);
	}
	
}
