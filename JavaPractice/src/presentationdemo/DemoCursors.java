package presentationdemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class DemoCursors {

	public static void main(String[] args) {
		
		// Cursors: To Retrive Objects by one by one
		// Enuration 1.0v , Iterator 1.2v , ListIterator 1.2v
		
		// Enumeration
		// Emuration elements();
		// hasMoreElements(), nextElement
		
		Vector<Integer> v2 = new Vector<>();
		v2.addElement(10);
		v2.add(20);
		v2.add(25);
		v2.add(15);
		//System.out.println(v2);
		
		Enumeration<Integer> et = v2.elements();
		
		while(et.hasMoreElements()) {
			
			Integer i1 = et.nextElement();
			
			if(i1 % 2 == 0) {
				//System.out.println(i1);
			}
		}
		
		// iterator();
		// hasNext, next, remove
		ArrayList<String> al = new ArrayList<>();
		al.add("sagar");
		al.add("vidya");
		al.add("ankit");
		al.add("kaptan");
		
		System.out.println(al);
		
		Iterator<String> it = al.iterator();
		
		/*while(it.hasNext()) {
			
			String s2 = it.next();
			
			if(s2.equals("sagar")) {
				it.remove();
			}
			
		}*/
		//System.out.println(al);
		
		ListIterator<String> ltr = al.listIterator();
		
		while(ltr.hasNext()) {
			String s2 = ltr.next();
			
			if(s2.equals("sagar")) {
				ltr.set("ram");
			}else if(s2.equals("vidya")) {
				ltr.add("krishna");
			}else if(s2.equals("kaptan")) {
				ltr.remove();
			}
		}
		
		System.out.println(al);
		
		while(ltr.hasPrevious()) {
			String s3 = ltr.previous();
			
			if(s3.equals("ram")) {
				ltr.set("kaptan");
			}
		}
		
		System.out.println(al);
		
	}

}
