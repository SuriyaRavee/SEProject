package LearnRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitTheInput {

	public static void main(String[] args) {
		
		String input = "123abc;";
		System.out.println(input);
		
		String pattern = ("([a-zA-Z]+[0-9]+.)");
		Pattern p= Pattern.compile(pattern);
		Matcher m= p.matcher(input);
		System.out.println(m.matches());
		for(int i=0; i<m.groupCount(); i++) {
			m.find();
			System.out.println(m.group());
		}
		
		
		}
	}


