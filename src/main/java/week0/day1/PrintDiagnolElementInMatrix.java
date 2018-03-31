package week0.day1;

import java.util.Scanner;

public class PrintDiagnolElementInMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[20][20];
		int sum =0, sum1 =0;
		int i, j, k=0, l=0, rows=4, col=4;
		System.out.println("Enter the elements");
		for(i=0; i<rows; i++) {
			for(j=0; j<col; j++) {
				a[i][j] = s.nextInt();
			}
		}

		System.out.println("The matrix is:");
		for(i=0; i<rows; i++) {
			for(j=0; j<col; j++) {

				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	//To print frwd diagnol
		System.out.println("print frwd diagnol");
		for(i=0; i<rows; i++) {
			for(j=0; j<col; j++) {
				if(i==j) {
					System.out.println(a[i][j]+" ");
					sum = sum + a[i][j];
				}
				}
				
			}
		System.out.println("the Sum is" + sum);
			
	for(i=0; i<=3; i++) {
		for(j=3; j>=0; j--) {
			if(i==0 && j==3 || i==1 && j==2 || i==2 && j==1 || i==3 && j==0) {
			System.out.println(a[i][j]+" ");
			sum1 = sum1 + a[i][j];
		}
	}
	}
	System.out.println("the Sum is" + sum1);
	
		}
	}

