package week0.day1;
import java.util.Scanner;



public class RemoveDuplicatesfromString
{

	public static void main(String[] args) {
	int count =0;	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String sentence = s.nextLine();
	String temp="";
	int i;
	for(i=0; i<sentence.length(); i++) {
		if(temp.indexOf(sentence.charAt(i)) == -1) {
			temp = temp+sentence.charAt(i);
		
		}
		//To check the duplicate value present and count the number
		else if(temp.indexOf(sentence.charAt(i)) != -1){
			count++;
		}
	}
System.out.println("Without duplicating character: "+temp+" ");

	
	}
}
