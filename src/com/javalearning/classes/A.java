package com.javalearning.classes;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("ab");
		System.out.println(p);
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Mayank");
		l.add("Verma");
		System.out.println(l);

		System.out.println("Class A");
	}
}