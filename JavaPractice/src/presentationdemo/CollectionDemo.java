package presentationdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		// collection

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println((i) + " -->" + arr[i]);
		}

		// Array : indexed collection of fixed number of homogeneous data elements
		// collection : growble/dynamic in nature, store: both homogeneous and
		// heterogeneous objects, every collection class
		// implemented based on some standard D.S

		// int ---> Integer : Autoboxing
		// Integer ---> int ; unboxing

		// collection: group of objects as single entity

		// list : duplicates are allowed and insertion order is preserved

		// ArrayList

		ArrayList<String> al = new ArrayList<>();
		al.add("hays1");
		al.add("hays");
		al.add(null);
		al.add("hays2");
		// initial size of 10 // once it reaches its capacity
		// new capacity will be (currentCapacity * 3/2) + 1 10*3/2 +1
		ArrayList al2 = new ArrayList(20);

		ArrayList al3 = new ArrayList(al);
		System.out.println(al3);

		// D.S : resizable Array

		// System.out.println(al);
		CollectionDemo c = new CollectionDemo();
		System.out.println(c);
		CollectionDemo c2 = (CollectionDemo) c.clone();
		System.out.println(c2);

		// RandomAccess Interface

		LinkedList ld = new LinkedList();
		// D.S : doubly linkedList
		LinkedList ld1 = new LinkedList(al);
		System.out.println(ld1);

		Vector v1 = new Vector(ld);
		// 1.0v it also known as legacy class
		// initial capacity =10, newcap = 2 * currcap

		// Marker Interface: which does not contain any methods and constants inside of
		// it.
		// Serializable, clonable and random access

		v1.add("sagar");
		v1.add("ankit");
		v1.add("kaptan");
		v1.add(100);
		v1.add(null);
		System.out.println(v1);

	}

}
