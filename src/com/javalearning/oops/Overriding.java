package com.javalearning.oops;

class Parent {
	public void Property() {
		System.out.println("Land+Cash+Gold");
	}

	// Overridden Method
	public void Marry() {
		System.out.println("Appalamma");
	}
}

class Child extends Parent {
	// Overriding Method
	public void Marry() {
		System.out.println("Sunny");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Child C = new Child();
		C.Property();
		C.Marry();
	}
}