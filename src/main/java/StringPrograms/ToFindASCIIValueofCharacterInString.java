package StringPrograms;

public class ToFindASCIIValueofCharacterInString {

	public static void main(String[] args) {
		String str = "suriyaaa";
		int i;
		
		for(i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int asciivalue = ch;
			System.out.println("The ASCII value of the character "+ch +" is "+asciivalue);
	
			}
			
		}
		
}
