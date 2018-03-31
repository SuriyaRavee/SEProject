package week0.day1;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rem, rev=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int temp=num;
		while(temp>0) {
			rem = temp%10;
			rev = rev *10+rem;
			temp=temp/10;
			
			
		}
		System.out.println("After reversing"+rev);

		if(num == rev) {
			System.out.println("This is amstrong number");
		}
		else {
			System.out.println("Not an amstrong number");
		}
		
	}

}
