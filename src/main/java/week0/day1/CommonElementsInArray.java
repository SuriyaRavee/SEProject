package week0.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr1 = {1,2,11,3,4,5,6,9};
		int arr2[] = {2,5,9,11,88};
		int arr3[] = {2,5,2,25,9,11,33};
		
		int x=0, y=0, z=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		while(x<arr1.length && y<arr2.length && z<arr3.length) {
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				list.add(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x] < arr2[y])
				x++;
			else if(arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
		System.out.println("The common elements are");
		System.out.println(list);
	}

}
