package java8features;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaOnEmployeeClass {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("sagar", 76));
		emp.add(new Employee("bhupinder", 67));
		emp.add(new Employee("ankit", 43));
		emp.add(new Employee("vidya", 16));
		emp.add(new Employee("kaptan", 24));
		
		System.out.println(emp);
		
		// arrange them ascending order of empNo
		//Collections.sort(emp, (e1, e2) -> (e1.empNo < e2.empNo) ? -1 : (e1.empNo > e2.empNo) ? +1 : 0);
		
		// arrange employee in dictionary order
		Collections.sort(emp, (e1,e2) -> (e1.name.compareTo(e2.name)));
		System.out.println(emp);
		
	}

}
