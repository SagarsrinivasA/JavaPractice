package java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoPredicateFuction {

	public static void main(String[] args) {
		// Predicate function is FI having SAM to check conditionally 
			// need to specify input type but always output will be boolean
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(new Employee("sagar", 12, 12000));
		al2.add(new Employee("bhupinder", 19, 28000));
		al2.add(new Employee("vidya", 32, 62000));
		al2.add(new Employee("kaptan", 72, 45000));
		al2.add(new Employee("ankit", 62, 58000));
		
		//System.out.println(al2);
		
		Predicate<Employee> p1 = e -> e.empSalary > 30000 ;// we can give any number of conditions to check 
		
		for(Employee e1 : al2) {
			if(p1.test(e1)) {
				System.out.println(e1.name + " " + e1.empSalary);
			}
			
		}

	}

}
