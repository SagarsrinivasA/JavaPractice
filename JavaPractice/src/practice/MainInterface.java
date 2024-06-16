package practice;

public interface MainInterface {
	
	abstract public void abstractMethod1();
	void abstractMethod2();
	
	default void abstractMethod3() {
		System.out.println("Operation Not Supported");
	}
}
