package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoStreamAPIWithString {

	public static void main(String[] args) {
		
		String str = "javaprogramming";
		
		Map<String, Long>map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.printf("occurence", map);
		System.out.println();
		
		List<String> l1 = new ArrayList<String>();

		l1.add("sagar");
		l1.add("vidya");
		l1.add("ankit");
		l1.add("kaptan");
		l1.add("bhupinder");

		System.out.println(l1);

		List<String> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2); // DNSO i.e sorting in alphabetical order

		List<String> l3 = l1.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l3); // CSO

		Comparator<String> c = (s3, s4) -> {
			int d1 = s3.length();
			int d2 = s4.length();
			if (d1 < d2)
				return -1;
			else if (d1 > d2)
				return 1;
			else
				return -s3.compareTo(s4);
		};

		List<String> l4 = l1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l4);

	}

}
