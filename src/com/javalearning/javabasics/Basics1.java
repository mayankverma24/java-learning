package com.javalearning.javabasics;

public class Basics1 {
	static final double piValue = 3.14;

	public static void main(String[] args) {

		// This step prints in the output
		System.out.println("I started Java learning.");

		// Add 2 numbers
		int a = 2;
		int b = 5;
		int c = a + b;
		System.out.println("Sum is " + c);
		// Basics1 obj1 = new Basics1();
		// System.out.println(piValue);
		System.out.println("Start another method");
		Methods obj1 = new Methods();

		obj1.Datatypes();
		// Datatypes();
		System.out.println("End another method");

	}

}
