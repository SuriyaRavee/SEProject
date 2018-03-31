package week0.day1;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = {1, 2,3,4,6,7,8,9};
		int sum, restsum=0, missingnum;
		
		int n= arr.length+1;
		sum = n*(n+1)/2;
		System.out.println("The missing number is");
		for(int i=0; i<arr.length;i++) {
			restsum = restsum+arr[i];
		}
		
		missingnum = sum-restsum;
		System.out.println(missingnum);
		
		
	}
}