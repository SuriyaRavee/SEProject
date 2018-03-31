package StringPrograms;

import java.util.HashMap;

public class OccurencesOfWordInString {

	public static void main(String[] args) {
		String str = "Suriya Ravi Ravi is a good girl very good girl";
		String[] words = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String newstr: words) {
			//if(map.get(newstr) !=null) {
				if(map.containsKey(newstr)) {
					int value = map.get(newstr);
					map.put(newstr, value+1);
					
				}
				else {
					map.put(newstr, 1);
				}
				
			}
		System.out.println(map);
		}

	}


