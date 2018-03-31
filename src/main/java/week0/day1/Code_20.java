package week0.day1;
import java.util.Arrays;
import java.util.Scanner;

public class Code_20 {

	public static void main(String[] args) {
		/*Write a simple Java program to display the digits of the number in ascending order. 

		Ex.  Input = 186553. 
			Output = 13568.*/
		int orgdigit = 198235;
		int digit = orgdigit;
		String digitstr = orgdigit+"";
		int [] arr = new int[digitstr.length()];
		int index =0, tmp, remval;

		while(digit>0) {
			remval = digit%10;
			digit = digit/10;
			arr[index] = remval;
			index++;
		}

		for(int j=0; j<arr.length; j++) {
			for(int j2=j; j2<arr.length; j2++) {
				if(arr[j]>arr[j2]) {
					tmp = arr[j2];
					arr[j2] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//1st method
		System.out.println("The ascending order of "+orgdigit+" number is: ");
		System.out.println(Arrays.toString(arr).replace(", ", "").replace("]", "").replace("[", ""));

		//2nd method
		System.out.println("The ascending order of "+orgdigit+" number is: ");
		System.out.println(Arrays.toString(arr).replaceAll("[\\W]", ""));
		System.out.println(Arrays.toString(arr).replace("[\\W]", ""));

		//3rd method
		System.out.println("The ascending order of "+orgdigit+" number is: ");
		for(int j: arr) {
			System.out.println(j);
		}


	}
}


