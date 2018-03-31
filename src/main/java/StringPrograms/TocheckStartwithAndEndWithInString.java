package StringPrograms;
import java.util.Scanner;

public class TocheckStartwithAndEndWithInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scan.nextLine();
		if(input.startsWith("Hello")&& input.endsWith("TestLeaf")) {
			System.out.println("The given condition is checked and it is correct");
		}
		else {
			System.out.println("The given condition is checked and it is incorrect");
		}
		

	}

}
