package collectionpractice;

import java.util.Hashtable;

public class HashTablePractice {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable(25);
		ht.put(new HashTemp(5), "A");
		ht.put(new HashTemp(2), "B");
		ht.put(new HashTemp(6), "C");
		ht.put(new HashTemp(15), "D");
		ht.put(new HashTemp(23), "E");
		ht.put(new HashTemp(16), "F");
		
		System.out.println(ht);
		
	}

}

class HashTemp{
	
	int i;
	
	HashTemp(int i){
		this.i = i;
	}
	
	public String toString() {
		return i + "";
	}
	
	public int hashCode() {
		return i;
	}
}
