package week0.day1;
import java.util.Scanner;

public class ToFindNoOfDaysInMonth {

	public static void main(String[] args) {
		int numberOfDays=0, year;
		String nameOfMonth = "Unknown";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month");
		int month = scan.nextInt();
		System.out.println("Enter the year");
		year = scan.nextInt();
		
		switch(month) {
		
		case 1:
			nameOfMonth = "January";
			numberOfDays =31;
			break;
			
		case 2:
			nameOfMonth = "February";
			if((year%400==0) ||(year%4==0)&&(year%100!=0)){
			numberOfDays =29;
			}
			else {
				numberOfDays = 28;
			}
			break;	
			
		case 3:
			nameOfMonth = "March";
			numberOfDays =31;
			break;
			
		case 4:
			nameOfMonth = "April";
			numberOfDays =30;
			break;
			
		case 5:
			nameOfMonth = "May";
			numberOfDays =31;
			break;
			
		case 6:
			nameOfMonth = "June";
			numberOfDays =30;
			break;
			
			
		case 7:
			nameOfMonth = "July";
			numberOfDays =31;
			break;
			
		case 8:
			nameOfMonth = "August";
			numberOfDays =31;
			break;
			
		case 9:
			nameOfMonth = "Sepetember";
			numberOfDays =30;
			break;
			
		case 10:
			nameOfMonth = "October";
			numberOfDays =30;
			break;
			
		case 11:
			nameOfMonth = "November";
			numberOfDays =30;
			break;
			
		case 12:
			nameOfMonth = "December";
			numberOfDays =31;
			break;
			}
	System.out.println(nameOfMonth+"of the year"+year+"contains"+numberOfDays);
	}

}
