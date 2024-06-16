package gfgjava8tutorial;

import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

public class MethodReference {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("sagar", "sahana", "anantha", "kumari");

		// capitalize the string by using capitalize method

		str.forEach(word -> StringUtils.capitalize(word));

		// Binding
		/*
		 * A obj = new A(); obj.display(); obj.print();
		 */

		A obj1 = new B();
		obj1.display(); // static binding
		obj1.print(); // dynamic binding
	}

}

// Binding: Two types
//1. Static binding : The binding which can be resolved at compile time by the compiler is known as static or early binding. 
//The binding of all the static, private, and final methods is done at compile-time.
//2. Dynamic binding: In Dynamic binding compiler does not decide the method to be called. Overriding is a perfect example of dynamic binding. 
//In overriding both parent and child classes have the same method.

class A {
	public static void display() {
		System.out.println("parent method");
	}

	public void print() {
		System.out.println("print of parent");
	}
}

class B extends A {
	public static void display() {
		System.out.println("child method");
	}

	public void print() {
		System.out.println("print of child");
	}
}