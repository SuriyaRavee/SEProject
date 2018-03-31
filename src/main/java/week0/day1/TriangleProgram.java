package week0.day1;
import java.util.Scanner;

public class TriangleProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows you want to print");
		int noOfRows = scan.nextInt();
		 //Initializing rowcount with 1
		int rowCount =1;
		System.out.println("The pyramis");
		
		// Implementing the logic
		for(int i=noOfRows; i>=1; i-- ) {
			  //printing i*2 spaces at the begining of each row
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			
			 //Printing j where j value will be from i to noOfRows
		for(int j=i; j<=noOfRows; j++) {
			System.out.print(j+" ");
		}
		 //Printing j where j value will be from noOfRows-1 to i
		for(int j=noOfRows-1; j>=i; j--) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		
		 //Incrementing the row count
		rowCount++;
		}
		

	}

}
