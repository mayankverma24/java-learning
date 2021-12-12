package mayank;

import accessmodifiers.Student;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Mayank", 32, "110 River St");
		//s.setName("Rahul");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}
}
