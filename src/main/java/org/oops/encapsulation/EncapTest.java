package org.oops.encapsulation;

public class EncapTest {
	static int x = 3;

	static int m1(int n) {
		System.out.println("I am static method");
		return n;
	}

	public static void main(String[] args) {
		Number n = new Number();
		n.setY(7);
		int num = n.getY();
		System.out.println(num);
		n.setY(23);
		System.out.println(n.getY());
		System.out.println(x);
		// EncapTest ob = new EncapTest();
		System.out.println(m1(33));
	}
}
