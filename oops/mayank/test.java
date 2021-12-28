package mayank;

public class test {

	public static void main(String[] args) {
		int num = 5;
		int fac = 1;

		for (int i = 2; i <= num; i++) {
			fac = fac*i;
		}
		System.out.println(fac);
	}
}