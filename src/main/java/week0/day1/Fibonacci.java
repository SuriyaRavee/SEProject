package week0.day1;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0, b=1, c=0, limit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of times");
	     limit = scan.nextInt();
	     
	     //print the first 2 terms of fibonacci
	      System.out.println(a);
	      System.out.println(b);
	      c=a+b;
	      
	      //decrease the limit by 2, since the 1st two numbers are already printed
	       limit = limit-2;
	       while(limit>0) {
	    	   System.out.println(c);
	    	   a=b; 
	    	   b=c;
	    	   c=a+b;
	    	   limit--;
	       }
		
		}
		
	}


