package week0.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NumberOfDaydBtwGivenDates {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat dates = new SimpleDateFormat("DD MM YYYY");
		String fromDate;
		String toDate;
		System.out.println("Enter fromDate");
		fromDate = scan.next();
		System.out.println("Enter TODate");
		toDate = scan.next();
		
		Date fromDate1 = dates.parse(fromDate);
		Date toDate1 = dates.parse(toDate);
		
		long difference = fromDate1.getTime() - toDate1.getTime();
		float daysBetween = (difference/(1000*60*60*24));
		System.out.println("Number of days between given dates = "+daysBetween);

	}

}
