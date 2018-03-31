package StringPrograms;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSplCharInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = "{Java}/**#$%\\*( Programming)12345";
		String input1="{Java}/**#$%\\*( Programming)12345";
		System.out.println("The Given String is: "+input);
		 input = input.replaceAll("[^a-zA-Z0-9]", "");
		
		
		
		System.out.println("After replacing Special character:" +input);
		
	 input1 = input1.replaceAll("[a-zA-Z0-9]", "");
	System.out.println("After replacing AlphaNumeric character:"+input1);

	}

}
