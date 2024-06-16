package java8features;

public class DemoFetures {

	public static void main(String[] args) {
		
		// Lambda expression
			 // it is anonymous function which is
		   	 	 // Nameless (without name)
		 	 	 // without return type
		  	 	 // without modifier
		// Functional Interface (FI)
			// An Interface which is having only one Abstract method (SAM). where it can have any number of default and 
			// static methods
			// ex: Runnable  :- run();
			//     Comparable :- compareTo();
			//     Comparator:- compare();
		
		/*FunctionalInterfaceDemo i = (a,b) -> System.out.println("sum "+ (a+b));
		i.add(10, 20);
		i.add(100, 200);
		i.add(1000, 2000);*/
		
		FunctionalInterfaceDemo i = n -> n*n;
		System.out.println(i.squreIt(8));
		System.out.println(i.squreIt(9));
	}

}
