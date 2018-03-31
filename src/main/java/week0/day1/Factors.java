package week0.day1;
import java.util.Scanner;
public class Factors {
       public void allfactors(int num) {
		System.out.println("The factors are: ");
		  for(int i=1; i<=num; i++) {
			if(num%i ==0) {
               System.out.println(i);
			}
		  }
		}


     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int inputnum = s.nextInt();
	
		int flag =0, rem;
		Factors prime = new Factors();
		prime.allfactors(inputnum);
		System.out.println("The prime factors are:");
		for(int j=1; j<=inputnum; j++) {
			rem = inputnum%j;
			if(rem ==0) {
				for(int i=2; i<=j/2; i++) {
					if(j%i ==0) {
						flag=flag+1;
						break;
					}
				}
				if(flag ==0) {
					System.out.println(j);
				}
			
			}
		}
	
	
     
     
     }

}
