package week0.day1;

import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatingElementinArray  {

	public static void main(String[] args) {
		int arr1[]= {6,3,5,9, 5,7, 1, 5};
		int min =-1;
		HashSet<Integer> set = new HashSet<>();
		for(int i=arr1.length-1; i>=0; i--) {
			if(set.contains(arr1[i])) {
				min =i;
			}
			else
				set.add(arr1[i]);
		}
		
		if(min!= -1) {
			System.out.println("The 1st repeating element is "+ arr1[min]);
		}
		else {
			System.out.println("No repeating element");
		}
		
	}

}
