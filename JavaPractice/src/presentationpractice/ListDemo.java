package presentationpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		//1. Collection(I)
		
		
		ArrayList al = new ArrayList();
		al.add("hays");
		al.add(100);
		al.add(null);
		al.add("hays");
		//System.out.println(al);
		System.out.println(al.get(2));
		
		// ArrayLiast Constructor
		
		ArrayList al1 = new ArrayList();
		// creates an empty AL object with default initial capacity = 10
		// once it reaches maximum capacity, 
		// newcapacity = (current capacity * 3/2) + 1 ;
		
		ArrayList al2 = new ArrayList(15);
		ArrayList al3 = new ArrayList(al);
		System.out.println(al3);
		
		LinkedList ld = new LinkedList();
		LinkedList ld1 = new LinkedList(al);
		System.out.println(ld1);
		
		ld.add("sagar");
		ld.add(7);
		ld.add(new ArrayList(al));
		ld.add(null);
		ld.add(7);
		System.out.println(ld);
		ld.addFirst("Vidya");
		System.out.println(ld);
		ld.removeFirstOccurrence(7);
		System.out.println(ld);
		
		Vector v1 = new Vector(al);
		// initial capacity = 10
		// newCapacity = 2 * currentCapacity
		System.out.println(v1);
		
		Stack st = new Stack();
		
		
		
		
		

	}

}
