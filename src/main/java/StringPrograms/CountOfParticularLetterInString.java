package StringPrograms;

public class CountOfParticularLetterInString {

	public static void main(String[] args) {
		String str = "Heloo Welcome Too The the the  Worldd";
		System.out.println(str);
		int count=0;
		int i;
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i)=='o') {
				count++;
				
			}
				
		}
		System.out.println("The number of times occurence of A is: "+count);
		
	}

}
