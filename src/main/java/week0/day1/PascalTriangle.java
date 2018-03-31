package week0.day1;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int inputnumber= scan.nextInt();
		for(int i=0; i<inputnumber; i++) {
			for(int space =0; space<inputnumber-i; space++) {
				System.out.print(" ");
			}
		int pasvalue = 1;
		for(int j=0; j<=i; j++) {
			System.out.print(pasvalue+" ");
			pasvalue = pasvalue*(i-j)/(j+1);
		}
		System.out.println();
		
		}

scan.close();
		


	}

}
