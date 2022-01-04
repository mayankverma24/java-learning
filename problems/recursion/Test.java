package recursion;

public class Test {
	public static void main(String[] args) {
		print(3);
	}

	public static void print(int n) {
		if (n > 0) {
			System.out.printf("%d ", n);
			print(n - 1);
		}
	}
}
