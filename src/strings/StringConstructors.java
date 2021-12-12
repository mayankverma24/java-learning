package strings;

//Important Constructors of String class (Total 6 constructors) 
public class StringConstructors {

	public static void main(String... args) {
		
		//Empty constructor
		String s = new String();
		System.out.println(s);
		
		//String literal constructor
		String l = "Mayank Verma";
		String s1 = new String(l);
		System.out.println(s1);
		
		//StringBuffer constructor
		StringBuffer sb1 = new StringBuffer("Durga");
		String s2 = new String(sb1);
		System.out.println(s2);
		
		//StringBuilder constructor
		StringBuilder sb2 = new StringBuilder("Erica");
		String s3 = new String(sb2);
		System.out.println(s3);
		
		//character constructor
		char[] ch = { 'j', 'a', 'v', 'a' };
		String s4 = new String(ch);
		System.out.println(s4);

		//byte constructor
		byte[] b = { 97, 98, 99, 100 };
		String s5 = new String(b);
		System.out.println(s5);
	}
}
