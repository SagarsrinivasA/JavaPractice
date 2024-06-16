package java8features;

public class Employee {

	public String name;
	public int empNo;
	public double empSalary;
	public Employee(String name, int empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", empSalary=" + empSalary + "]";
	}
	public Employee(String name, int empNo, double empSalary) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.empSalary = empSalary;
	}
	
	
}
