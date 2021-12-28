package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashmapsort {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Java");
		hmap.put(13, "C");
		hmap.put(2, "Python");
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println(" Sorting:");
		
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry m2 = (Map.Entry) iterator2.next();
			System.out.print(m2.getKey() + ": ");
			System.out.println(m2.getValue());
		}
	}
}