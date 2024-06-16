package gfgjava8tutorial;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
		// we can apply lambda expression for Functional interface i.e which is having only one abstract method.
		
		DemoFuncInterFace df = (int i) -> (18 % i);
		System.out.println(df.calculate(5));
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(70);
		
		System.out.println(al);
		// iterate over the list

		al.forEach(i -> System.out.println(i));
		al.forEach(i -> {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		});
	}

}


