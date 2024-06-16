package presentationpractice;

public class Customer implements Comparable {
	
	int value;
	String name;
	
	public Customer(int value, String name){
		this.value = value;
		this.name = name;
		
	}
	
	public String toString() {
		return name+ " "+value;
	}

	@Override
	public int compareTo(Object o) {
		
		int id1 = this.value;
		Customer c1 = (Customer)o;
		int id2 = c1.value;
		
		if(id1 < id2) {
			return -1;
		}else if(id1 > id2) {
			return +1;
		}else {
			return 0;
		}
	}
	

}
