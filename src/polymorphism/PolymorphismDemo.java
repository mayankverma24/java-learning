package polymorphism;

//import org.apache.commons.collections4.Get;

public class PolymorphismDemo {
	private int k = 3;

	public static void main(String args[]) {
		PolymorphismDemo obj1 = new PolymorphismDemo();
		obj1.Add(70, 70);
		obj1.Add(40, 55, 33);
		obj1.Add(66.7, 22);
		obj1.Add(44, 45.5);
		obj1.Add(44.0, 42.4);
		System.out.println(obj1.k);
		// obj1.k = 4;
		System.out.println(obj1.k);
		System.out.println(obj1.getk());
		// System.out.println(addition());

	}

	public int getk() {
		return k;
	}

	public void setk(int newInt) {
		this.k = newInt;
	}

	public void Add(int a, int b) {
		int c = a + b;
		System.out.println("Sum is: " + c);
	}

	// Same method, Number of arguments changed
	public void Add(int a, int b, int d) {
		double c = a + b + d;
		System.out.println("Same method, Number of arguments changed: " + c);
	}

	// Same method, Type of arguments changed
	public void Add(double a, int b) {
		double c = a + b;
		System.out.println("Same method, Type of arguments changed: " + c);
	}

	// Same method, Order of arguments changed
	public void Add(int a, double b) {
		double c = a + b;
		System.out.println("Same method, Order of arguments changed: " + c);
	}

	// Same method, Type of both arguments changed
	public void Add(double a, double b) {
		double c = a + b;
		System.out.println("Same method, Type of both arguments changed: " + c);
	}
}
