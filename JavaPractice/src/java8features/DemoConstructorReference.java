package java8features;

public class DemoConstructorReference {

	public static void main(String[] args) {

		Test4 t4 = Sample::new;
		// referring FI get method with the constructor of Sample class
		Sample s1 = t4.get1("Sagar");

		// ways of implementing FI
		// 1. normal way of implementing the abstract method
		DemoImplement d1 = new DemoImplement();
		d1.m1("sagar", 112, 78);

		// through lambda expression
		Test5 t5 = (name, rollNo, marks) -> new DemoStudent(name, rollNo, marks);
		System.out.println(t5.m1("srinivas sagar", 123, 67));
		
		// through method reference
		Test5 t6 = DemoStudent :: new;
		System.out.println(t6.m1("vidya", 123, 98));

	}

}

interface Test4 {
	// public Sample get();
	// public Sample get();
	// if i am using argument
	public Sample get1(String s);

}

interface Test5 {
	public DemoStudent m1(String name, int rollNo, int marks);
}

class Sample {
	public Sample() {
		System.out.println("Executing constructor get method,...");
	}

	public Sample(String s) {
		System.out.println("Executing argument constructor get1 method,..." + s);
	}
}

class DemoStudent {
	public String name;
	public int rollNo;
	public int marks;

	public DemoStudent(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "DemoStudent [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}

}

class DemoImplement implements Test5 {
	public DemoStudent m1(String name, int rollNo, int marks) {
		DemoStudent s1 = new DemoStudent(name, rollNo, marks);
		System.out.println(s1.name + s1.rollNo + s1.marks);
		return s1;

	}
}
