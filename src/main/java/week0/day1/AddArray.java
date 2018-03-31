package week0.day1;
import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		int i,j;
		int matrix1 [][] = new int [3][3];
		int matrix2 [][] = new int [3][3];
		int matrix3 [][] = new int [3][3];

		Scanner s = new Scanner(System.in);

		System.out.println("Enter 1st matrix: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				matrix1 [i] [j] = s.nextInt();

			}
		}
		System.out.println("Enter 2nd matrix: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				matrix2 [i][j] = s.nextInt();

			}
		}

		System.out.println("Adding two matrices: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				matrix3 [i][j] = matrix1 [i][j] + matrix2[i][j];		        	
			}
		}

		System.out.println("After adding: ");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
