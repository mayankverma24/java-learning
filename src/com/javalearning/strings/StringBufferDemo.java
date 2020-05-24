package  com.javalearning.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Durga");
		StringBuffer sb2 = new StringBuffer("Durga");
		System.out.println(sb1 = sb2); // false

	}

}
