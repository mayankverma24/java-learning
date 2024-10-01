package org.oops.abstractionConcepts;

public abstract class Bank {
	//abstract method
	public abstract void loan();

	//Non-abstract methods
	public void credit() {
		System.out.println("I am in abstract class, Bank-- Credit");
	}
	public void debit() {
		System.out.println("Bank-- Debit");
	}

}
