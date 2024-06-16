package java8features;

import java.util.function.Predicate;

public class DemoPredicateJoining {

	public static void main(String[] args) {
		
		int [] x = {0,5,10,15,20,25,30};
		
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		
		for(int t : x) {
			/*if(p1.and(p2).test(t)) {
				System.out.println(t); // 20, 30
			}*/
			/*if(p1.or(p2).test(t)) {
				System.out.println(t);// except 5 all are true i.e 0, 10, 15, 20, 25, 30
			}*/
			if(p1.negate().test(t)) {
				System.out.println(t);// 5, 15, 25
			}
		}
	}

}
