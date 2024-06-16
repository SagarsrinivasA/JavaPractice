package practice;

@FunctionalInterface
public interface MathOperation {
	//This interface is Functional Interface
	//What is functional interface?
	//SAM is FI. (Single Abstract Method)
	//Annotating with @FunctionalInterface is optional
	
	int calculat(int a, int b);

}
