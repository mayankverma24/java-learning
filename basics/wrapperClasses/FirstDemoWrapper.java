package wrapperClasses;

public class FirstDemoWrapper {

	public static void main(String[] args) {
		int a = 100;
		Integer b = 200;
		System.out.println("Primitive " + a);
		System.out.println("Wrapper " + b);

		// ex1
		String price1 = "463";
		String price2 = "237";
		int result = Integer.parseInt(price1) + Integer.parseInt(price2);
		System.out.println(result);

		// ex2
		String price3 = "463.99";
		String price4 = "237";
		Double result1 = Double.parseDouble(price3) + Double.parseDouble(price4);
		System.out.println(result1);

		// Auto-Boxing - here variable c is automatically converted into an object using
		// wrapper class Integer
		int c = 100;
		Integer d = c;
		System.out.println("Auto-Boxing " + d);

		// Manual boxing
		int e = 200;
		Integer g = Integer.valueOf(e);
		System.out.println("Manual Boxing " + g);

		// Auto-Unboxing
		Integer aub = 400;
		int result2 = aub;
		System.out.println("Auto-Unboxing " + result2);
		
		// Manual Unboxing
		Integer ub = 300;
		System.out.println("Manual Unboxing " + ub.intValue());


	}

}
