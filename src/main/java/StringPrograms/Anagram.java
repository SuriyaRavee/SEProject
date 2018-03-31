package StringPrograms;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String name1 = "army,%^& golden";
		String name2 = "mary,%^& endolg";
	    name1= name1.replaceAll("\\s"+" ", "");
	    name1= name1.replaceAll("\\s"+" ", "");
	  
	    
		if(name1.length() == name2.length()) {
			char [] ch1 = name1.toCharArray();
			char [] ch2 = name2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean status = Arrays.equals(ch1, ch2);
			if(status==true) {
				System.out.println("Both Strings are Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
			}
		
		else {
			System.out.println("Both String should contain equal length");
		}
		
	}

}
