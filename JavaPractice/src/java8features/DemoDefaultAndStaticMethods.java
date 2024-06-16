package java8features;

public class DemoDefaultAndStaticMethods implements DemoDefaultStatic {

	public static void main(String[] args) {

		DemoDefaultAndStaticMethods obj = new DemoDefaultAndStaticMethods();
		obj.m3();
		
		//To call static method, it has to be from interface name
		DemoDefaultStatic.m4(); // only way to call
		//m4();  // invalid
		//DemoDefaultAndStaticMethods.m4();  // invalid
		// obj.m4();  // invalid
		
		// static method is undefined for implemented and non-implemented classes
	}
	
	// overriding default method in implemented class it has to be public we can give specific definition
	
	public void m3() {
		System.out.println("overriding default method");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	

}
