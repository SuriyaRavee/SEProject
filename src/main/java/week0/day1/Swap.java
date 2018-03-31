package week0.day1;
import java.util.Scanner;


public class Swap {

	public static void main(String[] args) {
		/*int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a = s.nextInt();
		System.out.println("Enter 2nd number: ");
		b = s.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping: "+a);
		System.out.println("After swapping: "+b);*/
		Scanner s = new Scanner(System.in);
		int i, j;
		int a[] = new int[4];
		int b[] = new int[4];
		int temp[] = new int[4];
		System.out.println("Enter 1dt array");
		for(i=0; i<3; i++) {
			a[i] = s.nextInt();
			
		}
		System.out.println("Enter 2nd array");
		for(i=0; i<3; i++) {
			b[i] = s.nextInt();
			
		}
		System.out.println("Printing 1st array");
		for(i=0; i<3; i++) {
		System.out.print(a[i]);
		}
		System.out.println(" ");
		System.out.println("Printing 2nd array array");
		for(i=0; i<3; i++) {
		System.out.print(b[i]);
		}
		System.out.println(" ");
		for(i=0; i<3;i++) {
		temp[i] = a[i];
		a[i] = b[i];
		b[i] = temp[i];
		}
		System.out.println("After swapping 1st aray value : ");
		for(i=0; i<3;i++) {
		System.out.print(a[i]);
		}
		System.out.println(" ");
		System.out.println("After swapping 2nd aray value : ");
		for(i=0; i<3;i++) {
		System.out.print(b[i]);
	
}
	}	
}
