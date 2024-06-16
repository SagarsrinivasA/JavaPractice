package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreamAPIWithInteger {

	public static void main(String[] args) {
		// create ArrayList of marks and filter failed students, give grace marks 5 to
		// every one and count the number of failed students and sort DNSO accordingly
		// marks

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(80);
		al.add(95);
		al.add(30);
		al.add(45);
		al.add(20);
		System.out.println(al);

		List<Integer> al2 = al.stream().filter(i -> i <= 35).collect(Collectors.toList());
		System.out.println(al2);

		List<Integer> al3 = al.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(al3);

		Long t = al.stream().filter(i -> i <= 35).count();
		System.out.println(t);

		List<Integer> al4 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al4); // DNSO applying interface Comparable with compareTo method

		List<Integer> al5 = al.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(al5);  // CSO: customized sorting order
		
		List<Integer> al6 = al.stream().sorted((i1, i2) -> i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println(al6);
		
		List<Integer> al7 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2))
				.collect(Collectors.toList());
		System.out.println(al7);
		
		Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max = al.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println(max);
		
		al.stream().forEach(System.out:: print);
		System.out.println();
		
		// toArray method: to convert stream object into array
		
		Integer[] i1 = al.stream().toArray(Integer[] :: new);
		for(Integer i2 : i1) {
			System.out.println(i2);
		}
	}

}
