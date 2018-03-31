package week0.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	int num1 = 100;
	int count =0;
	for(int i=2; i<num1; i++) {
		if(num1%i==0) {
			count++;
			break;
		}
	}
	
	if(count ==0) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Not prime number");
	}
	
	
	
	}}
	 