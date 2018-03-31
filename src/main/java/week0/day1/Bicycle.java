package week0.day1;

import java.util.Scanner;
public class Bicycle {

	   public static void main(String[] args) {
		   int a,b;
		   char choice;
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter the 1st number: ");
		   a = s.nextInt();
		   System.out.println("Enter the 2nd number: ");
		   b = s.nextInt();
		   System.out.println("1.Addition");
		   System.out.println("2.Subtraction");
		   System.out.println("3.Multiplication");
		   System.out.println("4.Division");
		   System.out.println("5.Exit");
		   System.out.println("Enter your Choice: ");
		   choice = s.next().charAt(0);
		   
		   switch(choice) {
		   case 'a':
			   int add = a+b;
			   System.out.println("The added value is: "+add);
			   break;
		   case 'b':
			   int sub = a-b;
			   System.out.println("The added value is: "+sub);
			   break;
		   case 'c':
			   int mul = a*b;
			   System.out.println("The added value is: "+mul);
			   break;
		   case 'd':
			   int div = a/b;
			   System.out.println("The added value is: "+div);
			   break;            
		   default:
			   
			   System.out.println("Wrong Choice");
			   break;
		   }
			   
			   
			   
			   
		   }
		   
	   }	   
		   

