package week0.day1;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a[][] = new int[20][20];
		int i, j, k=0, l=0, m=4, n=4;
		int lastrow = m-1, lastcol = n-1;
		System.out.println("Enter the elements");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				a[i][j] = s.nextInt();
			}
		}

		System.out.println("The matrix is:");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {

				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}


		while (k<m && l<n) {
			for(i=l; i<=lastcol; i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(i=k; i<=lastrow; i++) {
				System.out.print(a[i][lastcol]+" ");
			}
			lastcol--;    
			if (k<=lastrow) {
				for(i=lastcol; i>=l; i--) {
					System.out.print(a[lastrow][i]+" ");	
				}
				lastrow --;	
			}
			if(i<=lastcol) {
				for(i=lastrow; i>=k; i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
		}
	}

}
