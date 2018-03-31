package week0.day1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num1, num2, i, n, temp, rem;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		num1 = s.nextInt();
		System.out.println("Enter the ending number: ");
		num2 = s.nextInt();
		for(i =num1; i<=num2; i++) {
			temp =i;
			n=0;

			while(temp!=0) {
				rem = temp%10;
				n = n+rem*rem*rem;
				temp = temp/10;
				}
			if (i ==n) {
			System.out.println(n);
			}
          }
        }
	}


