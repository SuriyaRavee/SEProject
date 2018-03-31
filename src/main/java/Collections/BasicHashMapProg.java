package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BasicHashMapProg {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('A', 1);
		map.put('B', 17);
		map.put('S', 12);
		map.put('Z', 5);
		map.put('L', 2);
		map.put('Y', 25);
		System.out.println(map.entrySet());
		System.out.println(map.get('Y'));
		
		for(Entry<Character, Integer> eachcharacter : map.entrySet()) {
		//char[] eachcharacter = null;
		//System.out.println(eachcharacter);
		System.out.println("Key: "+eachcharacter.getValue()+" value is"+eachcharacter.getKey());
		//System.out.println(eachcharacter.getValue());
	
	}

}
}