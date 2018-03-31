package StringPrograms;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		System.out.println("The password should contain 10 characters");
		System.out.println("The password should contain atleast 2 letters and 2 digits");
		System.out.println("The password should contain atleast 1 uppercase");
		int letter=0, uppercase=0, digit =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password:");
		String password = scan.nextLine();
		int length = password.length();
		if(length >=10) {
			for(int i=0; i<= length-1; i++) {
				if(Character.isLetter(password.charAt(i))) {
					letter++;
				
				if(Character.isUpperCase(password.charAt(i))) {
					uppercase++;
				}
				}
				else if(Character.isDigit(password.charAt(i))) {
					digit++;
				}
				else {
					System.out.println("Password must contain letters and digits");
					System.exit(0);
				}
			}
		}
              if(letter>=2 && uppercase>=1 && digit>=2) {
            	  System.out.println("The Entered password is valid");
            	  
              }
              else {
            	  System.out.println("The Entered password is invalid");
              }
                  scan.close();     	  
              }

	}


