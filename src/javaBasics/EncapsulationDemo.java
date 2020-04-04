package javaBasics;

public class EncapsulationDemo {
	private int k = 3;

	public static void main(String[] args) {

		EncapsulationDemo obj1 = new EncapsulationDemo();

		System.out.println(obj1.k);
		//obj1.k = 4;
		System.out.println(obj1.k);
		System.out.println(obj1.getk());

	}

	public int getk() {
		return k;
	}

	public void setk(int newInt) {
		this.k = newInt;
	}

}
