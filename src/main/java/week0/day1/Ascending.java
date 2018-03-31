package week0.day1;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		int  i,j, temp=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a[] = new int[10];
		for(i=0; i<10; i++) {
			a[i] = scan.nextInt();

		}
		for(i=0; i<10; i++) {
			for(j=i+1; j<10; j++) {

				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		System.out.println("Ascending Order:");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		//System.out.print(a[10-1]);
	}


}

