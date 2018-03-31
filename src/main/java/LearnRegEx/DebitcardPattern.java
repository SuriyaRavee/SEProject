package LearnRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DebitcardPattern {

	public static void main(String[] args) {
		String pattern= "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		String input= "1234-1235-1234-1234";
		Pattern p= Pattern.compile(pattern);
		Matcher m= p.matcher(input);
		System.out.println(m.matches());

	}

}
