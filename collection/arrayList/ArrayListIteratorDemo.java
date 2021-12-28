package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("mayank");
		al.add(1);
		al.add(2);
		al.size();
		Iterator<Object> itr = al.iterator();
		while (itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);

		}
	}

}
