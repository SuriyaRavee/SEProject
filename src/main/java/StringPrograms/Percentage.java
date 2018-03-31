package StringPrograms;

import java.util.Scanner;


public class Percentage {

	public static void main(String[] args) {
		int lowerCase=0, upperCase=0, digit=0, anychar=0;

		String input ="The Tiger Runs @ The Speed Of 10km/hr";
		System.out.println(input);
		int length = input.length();
		System.out.println("Total number of characters in String: "+length);
		for(int i=0; i<=length-1; i++) {

			if(Character.isLowerCase(input.charAt(i))) {
				lowerCase++;
			}
			else if(Character.isUpperCase(input.charAt(i))){
				upperCase++;	
			}
			else if(Character.isDigit(input.charAt(i))) {
				digit++;		
			}
			else {
				anychar++;
			}
		}           
		System.out.println();
		System.out.println("Number of Lowercase in the String is: "+lowerCase);
		System.out.println("Number of UpperCase in the String is: "+upperCase);
		System.out.println("Number of digit in the String is: "+digit);
		System.out.println("Number of Other character present in the String is: "+anychar);
		System.out.println();


		double perOfLowerCase = lowerCase*100/length;
		System.out.println("The percentage of Lower case: "+perOfLowerCase+"%");

		double perOfUpperCase = upperCase*100/length;
		System.out.println("The percentage of Lower case: "+perOfUpperCase+"%");

		double perOfdigit = digit*100/length;
		System.out.println("The percentage of Lower case: "+perOfdigit+"%");

		double perOfOtherChar = anychar*100/length;
		System.out.println("The percentage of Lower case: "+perOfOtherChar+"%");


	}

}
