package presentationpractice;

public class CollectionDemo {

	public static void main(String[] args) {

		// Why we need Collection

		// 1. Array : indexed Collection of fixed number of homogeneous data elements
		// to overcome the limitation of array
		// i.e fixed in size, storing homogeneous elements and it is not implemented
		// based on some standard D.S i.e why we will not get
		// ready made method support.

		// collection is growable in nature
		// Store: both homogeneous and heterogeneous objects
		// Every Collection class implemented based on some standard D.S so we will get ready made method support
		// Wrapper class
        // int  -----> Integer      --AutoBoxing
		// Integer ----> int        --Unboxing
		
		// representing ---> group of individual objects as single entity 
		
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = new int[3];
		arr1[0] = 7;
		arr1[1] = 14;
		arr1[2] = 19;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println((i) + "--> "+arr1[i]);
		}
		Object[] ar = new Object[2];
		ar[0] = new Student();
		ar[1] = new Object();

	}

}

class Student {

}
