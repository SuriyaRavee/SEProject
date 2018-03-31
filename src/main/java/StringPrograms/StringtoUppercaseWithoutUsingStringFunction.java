package StringPrograms;
import java.util.Scanner;

public class StringtoUppercaseWithoutUsingStringFunction {

	public static void main(String[] args) {
		int i, ch=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the stribg");
		String input = scan.nextLine();
		System.out.println("The Output is:");

		for( i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			//converting to uppercase
			if(ch>96 && ch<123) {
				ch = ch-32;
				System.out.print((char)ch);
			}
			//converting to lowercase
			else if(ch>64 && ch<90) {
				ch = ch+32;
				System.out.print((char)ch);
			}


		}

	}
}