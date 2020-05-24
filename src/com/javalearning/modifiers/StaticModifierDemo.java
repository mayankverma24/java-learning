package com.javalearning.modifiers;

public class StaticModifierDemo {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		StaticModifierDemo o1 = new StaticModifierDemo();
		o1.x = 888;
		o1.y = 999;
		StaticModifierDemo o2 = new StaticModifierDemo();
		System.out.println(o2.x + " " + o2.y);

	}

}
