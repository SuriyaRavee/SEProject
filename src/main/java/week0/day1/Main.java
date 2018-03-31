package week0.day1;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{

		int num, rev=0, rem;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = s.nextInt();


		while(num>0) {

			rem = num%10;
			rev = rev*10+rem;
			num = num/10;


		}
		System.out.println("The reversed number is: "+rev);



	}
}

