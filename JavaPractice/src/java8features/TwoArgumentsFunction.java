package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TwoArgumentsFunction {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p1 = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p1.test(10, 10));
		System.out.println(p1.test(5, 20));

		List<Employee> l = new ArrayList<Employee>();
		BiFunction<String, Integer, Employee> f1 = (name, empNo) -> new Employee(name, empNo);
		l.add(f1.apply("vidya", 9126));
		l.add(f1.apply("kaptan", 9126));
		l.add(f1.apply("sagar", 9126));
		l.add(f1.apply("ankit", 9126));

		for (Employee e : l) {
			System.out.println("name" + " " + e.name);
			System.out.println("empNo" + " " + e.empNo);
			System.out.println();
		}
		
		List<Employee> l2 = new ArrayList<Employee>();
		l2.add(new Employee("sagar", 86, 40000));
		l2.add(new Employee("ankit", 56, 72000));
		l2.add(new Employee("kaptan", 87, 87000));
		l2.add(new Employee("vidya", 12, 98000));
		
		BiConsumer<Employee, Double> c = (e, d) -> e.empSalary = e.empSalary + d; 
		for(Employee e : l2) {
			c.accept(e, 500.0);
		}
		
		for(Employee e2 : l2) {
			System.out.println(e2.name + " "+ e2.empSalary);
		}
		

	}

}
