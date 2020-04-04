package javaBasics;

public class ConstructorDemo {
	int a;
	String b;

	ConstructorDemo() {
		System.out.println("I am in the Constructor");

	}

	public static void main(String[] args) {
		System.out.println("Hello");
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj.a);
		System.out.println(obj.b);
		ConstructorDemo obj2 = new ConstructorDemo("mayank", "hggjg");
	

	}

	public ConstructorDemo(String firstName) {
		//this(); // calling default constructor
	}

	public ConstructorDemo(String firstName, String lastName) {
		this("mayank"); // calling constructor with single argument of String type
	}

}
