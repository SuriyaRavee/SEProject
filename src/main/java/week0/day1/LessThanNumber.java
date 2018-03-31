package week0.day1;
import java.util.Scanner;

public class LessThanNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		System.out.println("Enter the digit");
		int digit = s.nextInt();
		
		//String line = Integer.toString(num);
		//char c = Integer.toString(digit).charAt(0);
		
		/*for(int i=num; i>0; i--) {
			if(Integer.toString(i).indexOf(c)==-1) {
				
				System.out.println("The Output is:"+i);
				break;*/
		
		num--;
			while(Integer.toString(num).contains(Integer.toString(digit))) {
				num--;
				}
			
				System.out.println("The output is: "+num);
				
			}
			
		
		
	

	}


