package StringPrograms;
import java.util.Scanner;

public class ToCountVowelsinString {

	public static void main(String[] args) {
		int i, vowels=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String input = scan.nextLine();
		
		input = input.toLowerCase();
		System.out.println(input);
		for(i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;	
			}
		
	}
System.out.println("The number of vowels in string is: "+vowels);
scan.close();

StringBuilder sb = new StringBuilder();
sb.append("V!").append(" ");
sb.append(" ");
System.out.println(sb);

StringBuffer sbu = new StringBuffer();
sbu.append(" ").append(" ");
sb.append(" ");
sbu.append(" ");
}
}