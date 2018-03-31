package week0.day1;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num, temp=0, rem, ams=0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = s.nextInt();


		while(num>0) {
			rem = num %10;
			ams = ams+rem*rem*rem;
			num = num/10;
			temp++;
		}
		System.out.println("After calculating:"+ams);

		if(temp!=0) {
			System.out.println("The number is Amstrong");
		}

		else {
			System.out.println("The number is not an Amstrong ");
		}

	}

}
