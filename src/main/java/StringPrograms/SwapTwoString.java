package StringPrograms;
import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String a=scan.nextLine();
		System.out.println("Enter the second Strinng:");
		String b=scan.nextLine();
		System.out.println("BeforeSwapping "+a+" and "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swapping "+a+" and "+b);
		scan.close();		
			
		
	}

}
