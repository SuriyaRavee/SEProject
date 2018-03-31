package week0.day1;
import java.util.Scanner;

public class TriangleProgramReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows you want to print");
		int noOfRows = scan.nextInt();
		//Initializing rowCount with noOfRows
		 
        int rowCount = noOfRows;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = 0; i < noOfRows; i++)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)             
            {
                System.out.print(j+" ");
            }
 
            //Printing j where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {                 
                System.out.print(j+" ");             
            }
             
            System.out.println();
 
            //Decrementing the rowCount
 
            rowCount--;
		
        }
	}

}
