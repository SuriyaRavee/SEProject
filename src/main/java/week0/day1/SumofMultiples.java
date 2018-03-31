package week0.day1;
import java.util.Scanner;

public class SumofMultiples {

	public static void main(String[] args) {
		int num,  sum=0;
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		System.out.println("Enter the 1st value ");
		a = s.nextInt();
		System.out.println("Enter the 2nd value:");
		b = s.nextInt();
		for(int i=1; i<num; i++) {
			if(i%a==0 || i%b==0) {
				System.out.print(i+" ");
				sum = sum+i;
			}
		     
		}
		System.out.println("The total is: "+sum);
		
		

	}

}
