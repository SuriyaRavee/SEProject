package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("Seventeen", 17);
		map.put("Tweleve", 12);
		map.put("Five", 5);
		map.put("Two", 2);
		map.put("Twenty Five", 25);

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("Sorting by value");
		for(Entry<String, Integer>item :list) {

			System.out.println(item);
		}
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareToIgnoreCase(o2.getKey());
			}
		});
		System.out.println("Sorting by Key");
		for(Entry<String, Integer>item1 :list) {

			System.out.println(item1);
			
		}

	}

}
