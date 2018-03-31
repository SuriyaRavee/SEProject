package week0.day1;
import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = s.nextInt();
		System.out.println("Enter the last number: ");
		b = s.nextInt();
		for(int i=a; i<b+1; i++)
		{
			if(i%3 ==0 && i%5!=0)
			{
				System.out.println("FIZZ");
             }
			else if(i%5==0 && i%3!=0) {
				System.out.println("BUZZ");
			}
		
			else if(i%3==0&& i%5==0) {
				
				System.out.println("FIZZBUZZ");
			}
			else {
				System.out.println(i);
			}
		
		}
		
	}

}
