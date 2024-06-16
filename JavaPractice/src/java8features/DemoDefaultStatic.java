package java8features;

public interface DemoDefaultStatic {

	public void m1();
	public void m2();
	
	// without effecting to implemented classes we can add new method by using default
	
	default void m3() {
		System.out.println("Default method");
	}
	
	public static void m4() {
		System.out.println("Static method in interface which can be possible from 1.8v onwards");
	}
}
