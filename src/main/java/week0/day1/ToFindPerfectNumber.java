package week0.day1;
import java.util.Scanner;

public class ToFindPerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum=0;
		System.out.println("Enter the number");
		num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			int rem = num%i;
			if(rem==0) {
				sum = sum+i;
			}
		}
		
      System.out.println("The Sum value is"+sum);
      int output;
      output = sum/2;
      System.out.println("The output is"+output);
      if(num ==output) {
    	 
    	  System.out.println("Given number is a perfect number");
      }
      else {
    	  System.out.println("Given number is not a perfect number");
      }
	}

}
