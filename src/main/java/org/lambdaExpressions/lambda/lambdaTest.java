package org.lambdaExpressions.lambda;

public class lambdaTest {
	public static void main(String[] args) {
		// Application with anonymous
		LambdaDemo l = new LambdaDemo() {
			public void disp() {
				System.out.println("this is anonymous...");
			}
		};
		l.disp();
		//Application with lambda
		LambdaDemo l1 = ()-> System.out.println("this is lambda");
		l1.disp();
	}
}
