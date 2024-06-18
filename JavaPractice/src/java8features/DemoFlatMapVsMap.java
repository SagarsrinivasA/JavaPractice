package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFlatMapVsMap {

	public static void main(String[] args) {

		// map : transforms each element with respective operation. here it is
		// converting each string to capital letter

		List<String> mapList = Arrays.asList("apple", "mango", "grapes", "banana");

		List<String> mapOutput = mapList.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("out put of map" + mapOutput);

		// flatMap: flattens the nested array list to one and transforms each string
		// with respective operation

		List<List<String>> nestedList = Arrays.asList(Arrays.asList("basketball", "football"),
				Arrays.asList("cricket", "tennis"), Arrays.asList("badminton", "volleyball"));
		
		System.out.println("out put of flatMap before transforming" + nestedList);

		List<String> flatMapList = nestedList.stream().flatMap(List::stream).map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("out put of flatMap after transforming" + flatMapList);
	}

}
