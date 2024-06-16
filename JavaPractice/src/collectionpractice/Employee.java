package collectionpractice;

public class Employee implements Comparable {
	public String name;
	public int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + " " + id;
	}

	@Override
	public int compareTo(Object o) {
		int id1 = this.id;
		Employee e = (Employee) o;
		int id2 = e.id;

		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return +1;
		} else {
			return 0;
		}
	}

}
