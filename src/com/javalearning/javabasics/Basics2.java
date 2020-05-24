package com.javalearning.javabasics;

import java.util.ArrayList;
import java.util.Random;

abstract class Vehicle {

	public abstract int getNoOfWheels();

}

abstract class Fruit {
	public abstract String getTaste();
}

class Bus extends Vehicle {

	public int getNoOfWheels() {

		return 6;
	}

}

public class Basics2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int rand_int = rand.nextInt(10);
		System.out.println(rand_int);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			arr1.add(i);
			System.out.println(arr1.get(i));

		}

	}
}