package strings;

public class String_Buffer_Constructors {

	public static void main(String args[]) {

		/*
		 * default capacity of StringBuffer is 16 then it will increase using this
		 * formula (16+1)*2
		 */
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		StringBuffer sb1 = new StringBuffer("durga");
		//sb1.reverse();
		//System.out.println(sb1);
		
		//sb1.setCharAt(2, 'l');
		//System.out.println(sb1.capacity()); // default capacity + length of the string "durga" i.e. 16+5=21
		//System.out.println(sb1);
		
		sb1.append(" Software");
		//System.out.println(sb1);
		
		//sb1.insert(3, "true");
		//System.out.println(sb1);
		
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		StringBuilder sb2 = new StringBuilder("mayank");
		System.out.println(sb2.reverse());
		
		
		
	}

}
