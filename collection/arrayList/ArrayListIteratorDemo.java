package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("sdfds");
		al.add(1);
		al.add(1);
		al.size();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);

		}
	}

}
