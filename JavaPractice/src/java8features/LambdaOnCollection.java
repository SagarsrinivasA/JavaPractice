package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaOnCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(5);

		System.out.println(al);

		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? -1 : (o1 > o2) ? +1 : 0;
		Collections.sort(al, c);
		System.out.println(al);
		
		// To print one by one
		al.stream().forEach(System.out::println);

		// if i want put all even numbers into the list by filtering
		
		List<Integer> al2 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(al2);
	}

}

/*
 * class MyAscendingComapre implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer o1, Integer o2) { /*if (o1 < o2) {
 * return -1; } else if (o1 > o2) { return +1; } else { return 0; }
 */

// by through conditional operator
// return (o1 < o2) ? -1 : (o1 > o2) ? +1 : 0;
// }

//}*/