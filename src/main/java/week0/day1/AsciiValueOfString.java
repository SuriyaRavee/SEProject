package week0.day1;



public class AsciiValueOfString {

    
	public static void main(String[] args) {
		 String name ="suriya";
		 char ch;
		 int n;
		 String temp= "";
		 //System.out.println(name);
		 int i;
		
		 for( i=0;  i<=name.length()-1; i++) {
		 n= (int)name.charAt(i);
		System.out.println(n);
	    ch= (char) ((char)n);
	
	//System.out.println(ch);
	temp= temp+ch;
	}
		 System.out.println(temp);
	}
}
