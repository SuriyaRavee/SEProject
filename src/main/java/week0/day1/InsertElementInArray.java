package week0.day1;
import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		int i, insert, pos;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[20];
		System.out.println("enter array elements");
		for( i=0; i<10; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The array is: ");
		for( i=0; i<10; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Ener the number to insert");
		insert = scan.nextInt();
		System.out.println("enter the position(index number) to insert");
		pos = scan.nextInt();
		
		//now create a space at required position
		for(i=10; i>pos; i--) {
			arr[i] = arr[i-1];
			
		}
		//inserting the value in position
		arr[pos] = insert;
		
		System.out.println("The new array is");
		for(i=0; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
