package week0.day1;
	
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RepeatedNumbersinArray {
	

	public static void main(String[] args) {
		int numbers[] = new int[10];
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for( i=0; i<10; i++) {
			numbers[i] = scan.nextInt();
		}
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(Integer eleArray1 : numbers) {
			if(!set.add(eleArray1)) {
			
				System.out.println(eleArray1);
				
			
		}
}}
}