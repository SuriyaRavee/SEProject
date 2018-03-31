package StringPrograms;

import java.util.HashMap;

public class ToFindOccurenceOfCharacterInString {

	public static void main(String[] args) {
		String str= "cognizantttt";
		/*int i;

		char ch, c;
		str = str.toUpperCase();
		for(c='A'; c<='Z'; c++) {
			int count=0;

			for(i=0; i<str.length(); i++) {
				ch = str.charAt(i);

				if(ch==c) {
					count++;

				}
			}
			if(count>0) {
				System.out.println(c+" = "+count);
			}



		}
*/
		
		//Using HashMap
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch :str.toCharArray()) {
			if(map.containsKey(ch)) {
				int val = map.get(ch);
			
				map.put(ch, val+1);
			}
			else {
				map.put(ch, 1);
			}
				
		}
		System.out.println(map);
	
		
	}
	
		
	

	}
