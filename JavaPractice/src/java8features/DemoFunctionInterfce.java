package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoFunctionInterfce {

	public static void main(String[] args) {
		
		// to check length of the string where input type is string and output type is integer
		
		Function<String, Integer> f1 = s2 -> s2.length();
		System.out.println(f1.apply("sagar srinivas"));

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks > 80)
				grade = "A [Distinction]";
			else if (marks > 60)
				grade = "B [First class]";
			else if (marks > 40)
				grade = "c [Second class]";
			else if (marks > 35)
				grade = "D [Third class]";
			else
				grade = "E [Failed]";
			return grade;

		};

		Student[] s = { new Student("Sagar", 26), new Student("vidya", 86), new Student("ankit", 66),
				new Student("bhupinder", 56), new Student("kaptan", 76) };

		// just print the student who's marks is greater than 60

		Predicate<Student> p = s1 -> s1.marks > 60;
		
		Consumer<Student> c = s2 -> {
			System.out.println("Student Name" + " " + s2.name);
			System.out.println("Marks" + " " + s2.marks);
			System.out.println("grade" + " " + f.apply(s2));
			System.out.println();
		};

		for (Student s1 : s) {
			if (p.test(s1)) {
				c.accept(s1);
			}
		}

	}
}
