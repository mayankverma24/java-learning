package org.oops.abstractionConcepts;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("I am implement method from Bank class");
	}

	public void funds() {
		
	}
	// method overriding
	public void debit() {
		System.out.println("I am overriden method");
	}

	public static void main(String[] args) {
		Bank obj1 = new HDFCBank();
		obj1.credit();
		obj1.debit();
		HDFCBank obj2 = new HDFCBank();
		obj2.loan();
		obj2.funds();
	}
}
