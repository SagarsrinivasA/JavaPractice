package practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		/*Class1 c1 = new Class1();
		c1.abstractMethod3();
		
		Class4 c4 = new Class4();
		c4.abstractMethod3();
		
		MathOperation fi = (a, b) -> a*b; // Lambda Expression
		
		MathOperation add = (a, b) -> a+b;
		
		System.out.println(fi.calculat(2, 4));
		System.out.println(add.calculat(2, 4));
		
		MathOperation mo = new MathOperation() {

			@Override
			public int calculat(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};*/
		
		List<String> myList = new ArrayList<String>();
		myList.add("sagar");
		myList.add("java");
		myList.add("spring boot");
		//System.out.println(myList);
		for(String name : myList) {
			//System.out.println(name);
		}
		//myList.forEach(list -> System.out.println(list));
		
		DecimalFormat df= new DecimalFormat("#,##0.00");
		System.out.println(df.format(.5678));
		
		String s1 = "Hello";
		String s2 = "world";
		String res = s1+s2;
		System.out.println(res.equals("Helloworld"));
		

	}

}
