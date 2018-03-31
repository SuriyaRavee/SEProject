package week0.day1;
import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {
		int i, countP=0, countZ=0, countN=0;
	
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num[] = new int[20];
		for(i=0; i<10; i++) {
			num[i] = Scan.nextInt();
			
			if(num[i]>0) {
			 countP ++;
				
			}
			
			if(num[i]==0) {
				 countZ ++;
					
				}
			if(num[i]<0) {
				 countN++;
					
				}
		
		}
		System.out.println("Positive Numbers:"+countP);
		System.out.println("Negative Numbers:"+countN);
		System.out.println("Zero Numbers:"+countZ);
	


for(i=0; i<10; i++) {
	 
	
	
	
	
	
}
}
}