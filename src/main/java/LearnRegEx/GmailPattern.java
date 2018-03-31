package LearnRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailPattern {

	public static void main(String[] args) {
		//String pattern ="\\w@gmail.com";
		String pattern ="\\w.@[a-zA-Z]{5}.[a-zA-Z]{3}";
		String input= "bala02@gmail.com";
		Pattern p= Pattern.compile(pattern);
		Matcher m= p.matcher(input);
		System.out.println(m.matches());
		while(m.find())
		{
			System.out.println(m.group());
			
		}

	}

}
