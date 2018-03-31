//To verify given string contains exactly 5 digit

package week0.day1;
import java.util.Scanner;


public class ToVerifyExactDigit {

	public static void main(String[] args) {
		int i, count=0;
		
		 ////If we dont need to consider the space in string
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
        String a = scan.nextLine();
		for( i=0; i<a.length(); i++) {
                if(a.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		if(count==5) {
			System.out.println("True");
		    }
		else {
			System.out.println("False");
		}
	
		
		//If we need to consider the space in string
	System.out.println("Enter a number");
	int inputNum=0;
	Scanner sc= new Scanner(System.in);
	String stringvalue = sc.nextLine();
	
	inputNum = stringvalue.length();
	System.out.println(inputNum);
	if (inputNum==5) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}


	
	 //To consider only digits in the string
	System.out.println("Enter a number");
	String inputstr = scan.next();
	int digits=0;
	for(int j=0; j<inputstr.length(); j++) {
		if(inputstr.contains(Integer.toString(j)));
		digits++;
		
	}
	System.out.println(digits);
	if(digits==5) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	
	
	
	
	

}
}

 