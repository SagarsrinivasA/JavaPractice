package gfgjava8tutorial;

public interface DemoFuncInterFace {
	
	int calculate(int x);
	
	default void methodDefault() {
		System.out.println("it is a default method");
	}

}
