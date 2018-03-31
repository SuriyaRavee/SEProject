package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
		public static void main(String[] args) {
			String str= "Suriyaaa Ravee";
			int i;

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
				if(count>1) {
					System.out.println("The Duplicating characters are "+ c +" = "+count+" times");
				}



			}

		}


}
		
		
		
		
	
	


