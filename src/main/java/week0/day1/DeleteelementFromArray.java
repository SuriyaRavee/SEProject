package week0.day1;

import java.util.Scanner;

public class DeleteelementFromArray {
	public static void main(String[] args) {
	int i, delete, count=0;
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[20];
	System.out.println("Enter the elements");
	for( i=0; i<10; i++) {
		arr[i] = scan.nextInt();
	}
	System.out.println("The array is: ");
	for( i=0; i<10; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Ener the number to delete");
	delete = scan.nextInt();
	
	for(i=0; i<arr.length; i++) {
		if(arr[i] == delete) {
			for(int j=i ; j<9; j++) {
				arr[j] = arr[j+1];
			}
			count++;
			break;
			
		}
	}
	
	if(count==0) {
		System.out.println("No element found");
	}
	else {
		System.out.println("New Array is");
		for(i=0; i<9; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
}