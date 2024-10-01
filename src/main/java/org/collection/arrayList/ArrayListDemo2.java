package org.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		List<Object> l = Collections.synchronizedList(al);
		
		al.add("hello");
		al.add(1);
		al.add(2);
		al.size();
		System.out.println(l);
		for (Object abc : al) {

			System.out.println(abc);
		}
	}

}
