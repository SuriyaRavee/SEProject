package week0.day1;

import java.util.Arrays;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class ContiSubsequentSequence {

	public static void main(String[] args) {
		int arr[] = {11,12,13,14,10,9,8,-7,6,5,4,2,-3,-2,-4, -5, -6};
		int i;
		int maxseqlength = 0;
		int maxseqstartindex =0;
		int currentseqlength =0;
		int currentseqstartindex=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				if(currentseqlength >maxseqlength ) {
					maxseqlength = currentseqlength;
					maxseqstartindex = currentseqstartindex;
				}
				currentseqstartindex = i+1;
				currentseqlength=0;
				}
			else {
				currentseqlength++;
		}
		}
		if(currentseqlength >maxseqlength ) {
			maxseqstartindex = currentseqstartindex;
			maxseqlength = currentseqlength;
		}
		
		for(i=maxseqstartindex; i<maxseqstartindex+maxseqlength; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The Length is: "+maxseqlength);
	}

}
