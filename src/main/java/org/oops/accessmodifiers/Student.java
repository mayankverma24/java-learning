package org.oops.accessmodifiers;

public class Student {
	// Encapsulated below properties using private access modifier
	String name;
	private int age;
	private String address;

	// Constructor - to create multiple objects
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name.substring(0, 1);
		//return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		Student john = new Student("John", 32, "112 River St");
		System.out.println(john.getName());
		// System.out.println(john.name);
	}
}