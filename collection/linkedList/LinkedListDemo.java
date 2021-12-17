package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add("durga"); // [durga]
		l.add(30); // [durga, 30]
		l.add(null); // [durga, 30, null]
		l.add("durga"); // [durga, 30, null, durga]
		l.set(0, "Software"); // [Software, 30, null, durga]
		l.add(0, "Venky"); // [Venky, Software, 30, null, durga]
		l.removeLast(); // [Venky, Software, 30, null]
		l.addFirst("CCC"); // [CCC, Venky, Software, 30, null]
		System.out.println(l); // [CCC, Venky, Software, 30, null]

	}

}
