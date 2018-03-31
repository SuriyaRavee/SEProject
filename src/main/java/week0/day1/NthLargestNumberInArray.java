package week0.day1;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NthLargestNumberInArray {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the kth Element");
		int k = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(57);
		list.add(9);
		list.add(155);
		list.add(99);
		list.add(58);
		Collections.sort(list);
		System.out.println("The array is"+list);
		  //kth largest element in array
		
		int value = list.size()-k;
		System.out.println(k+" largest elemnet is "+list.get(value));

		 //kth smallest value
		int value1 = list.get(k-1); 
		System.out.println(k+"smallest element is"+value1);
		
		
	
		
		
	}

}
