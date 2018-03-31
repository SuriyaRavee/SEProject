package LearnRegEx;

public class ExtractDigitFromText {

	public static void main(String[] args) {
	String input = "123TestLeaf456";
	input = input.replaceAll("[a-zA-Z]{8}", ",");
	System.out.println(input);
	}

}
