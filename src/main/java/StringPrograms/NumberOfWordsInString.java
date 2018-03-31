
package StringPrograms;
import java.util.Scanner;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		
		int count=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scan.nextLine();
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		
		}
		
System.out.println(count);
scan.close();
	}

}
